package StackPush;

import java.util.ArrayList;

// Generic stack class
public class StackPushclass<T> {

    // Variables
    private ArrayList<T> stack;
    private int size;

    // Constructor
    StackPushclass() {
        stack = new ArrayList<T>();
        size = 0;
    }

    // Pushing an object onto the stack
    void push(T object) {
        stack.add(object);
        size++;
    }
    T pop() {
        if (size > 0) {
            T value = stack.get(size-1);
            stack.remove(size-1);
            size--;
            return value;
        }
        // No values to pop, so return null
        else {
            return null;
        }
    }
    T peek(){
        if (size > 0) {
            T value = stack.get(size-1);
            return value;
        }
        //returns null
        else return null;
    }

    //clears stack
    void clear() {
        size = 0;
        stack.clear();
    }
}