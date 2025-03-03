package StackExample;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> implements StackInterface<T>{

    // attributes
    private ArrayList<T> stack;

    // constructor
    public Stack() {
        stack = new ArrayList<>();
        // of format []
        // if we have items like [a, b, c, d]
        // d is at the "top" of the stack
    }

    // adds a new object to the top of the stack
    public void push(T newEntry) {

    }

    // removes and returns the object at the top of the stack
    public T pop() {

        // example of how to check for errors/ exceptions
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            // actual code for pop
        }

    }

    // returns the object at the top of the stack
    public T peek() {

    }

    // determines if stack is empty
    public boolean isEmpty() {

    }

    // removes all objects from the stack
    public void clear() {

    }
}
