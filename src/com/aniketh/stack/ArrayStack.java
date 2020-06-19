package com.aniketh.stack;

import com.aniketh.EmployeeStack;

import java.util.EmptyStackException;

public class ArrayStack {
    private EmployeeStack[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new EmployeeStack[capacity];
    }

    public void push(EmployeeStack employeeStack) {
        if (top == stack.length) {
            // need to resize the backing array
            EmployeeStack[] newArray = new EmployeeStack[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employeeStack;
    }

    public EmployeeStack pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        EmployeeStack employeeStack = stack[--top];
        stack[top] = null;
        return employeeStack;
    }

    public EmployeeStack peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
