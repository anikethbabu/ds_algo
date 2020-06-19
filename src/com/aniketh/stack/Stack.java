package com.aniketh.stack;

public class Stack {
    private String[] array;
    private int size;

    public Stack(int size) {
        array = new String[size];

    }

    public void push(String input) {
        array[size++] = input;
    }

    public String pop() {

        return array[--size];
    }
}
  