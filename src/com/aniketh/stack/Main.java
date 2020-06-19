package com.aniketh.stack;

import java.util.ArrayList;

public class Main {
    ArrayList<WordPair> allPairs = new ArrayList<WordPair>();

    public static void main(String[] args) {
        String[] array = {"one", "two", "three"};
        Main m = new Main(array);
        System.out.println(m.allPairs);
    }

    private Main(String[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = i+1; j < array.length; j++)
                allPairs.add(new WordPair(array[i], array[j]));
    }
}

class WordPair {
    String first;
    String last;

    public WordPair(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString() {
        return "(" + first + "," + last + ")";
    }
}