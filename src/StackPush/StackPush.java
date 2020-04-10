/*
 * Created by: Maria Temu
 * Created on: 14-March-2020
 * Created for: ICS4U
 * Day #14 (StackPush)
 * This program lets the user enter integers and
 * push and pop and peek them
 */
package StackPush;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackPush {
    private JPanel panel;
    private JTextField txtTextfield;
    private JButton btnPeek;
    private JButton btnClear;
    private JList stackList;
    private JButton btnPop;
    private JButton btnPush;
    private JLabel lblAnswer;
    private JLabel lblStackList;
    private JLabel lblText;
    private JLabel lblPeeked;
    private Stack<Integer> stack = new Stack<>();
    private DefaultListModel<Integer> model = new DefaultListModel();

    public static void main(String[] args) {
        JFrame panel = new JFrame("StackPushclass");
        panel.setContentPane(new StackPush().panel);
        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.pack();
        panel.setVisible(true);
    }

    public StackPush() {

        stackList.setModel(model);
        btnPush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //try cath
                try {
                    //get no.,put it in the stack
                    String text = txtTextfield.getText();
                    Integer num = Integer.parseInt(text);


                    model.addElement(num);
                    stack.push(num);
                }
                catch (Exception trycatch) {
                    // Alert the user that their input is invalid
                    JOptionPane.showMessageDialog(null,  "Enter an integer.",
                            "Error 01", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnPop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pop top value
                model.remove(model.size() - 1);
                String text = stack.pop().toString();
                lblAnswer.setText(String.format("Popped value: %s", text));
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clearing the stack and the model
                stack.clear();
                model.clear();
            }
        });

        btnPeek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w) {
                // Peeking the value from the stack
                Integer value = stack.peek();
                //peeked no.
                lblPeeked.setText("Peeked: " + value);
                System.out.println("done");
            }

        });

    }
}
