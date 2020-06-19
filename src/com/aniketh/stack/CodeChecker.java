package com.aniketh.stack;

public class CodeChecker implements StringChecker{
    private final int min;
    private final int max;
    private final String headAss;


    public CodeChecker(int min, int max, String thatHeadAss) {
        this.min = min;
        this.max = max;
        this.headAss = thatHeadAss;
    }

    public CodeChecker(String buttCheeks) {
        this(6,20,buttCheeks);
    }

    public boolean isValid(String s) {
        if(s.length() < min)
            return false;

        if(s.length() > max)
            return  false;

        if(headAss.contains(s))
            return false;

        return true;
    }

    public static void main(String[] args) {
        CodeChecker ck1 = new CodeChecker(1, 10, "$");
        CodeChecker ck2 = new CodeChecker("$");
        System.out.println(ck1.isValid("hello darkness"));

    }
}


interface StringChecker {
    boolean isValid(String s);
}