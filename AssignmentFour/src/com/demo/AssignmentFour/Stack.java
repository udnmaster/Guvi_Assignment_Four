package com.demo.AssignmentFour;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    // Constructor
    public Stack() {
        stack = new LinkedList<>();
    }

    // Method to push elements onto the stack
    public void push(int element) {
        stack.addFirst(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop elements from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a default value indicating failure
        }
        return stack.removeFirst();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Trying to pop from an empty stack
        System.out.println("Popped element: " + stack.pop());
    }
}
