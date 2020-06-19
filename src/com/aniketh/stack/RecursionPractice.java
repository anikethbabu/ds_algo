package com.aniketh.stack;

public class RecursionPractice {
    public int factorial(int num){
        if(num == 1){
            return num;
        }
        return factorial(num);
    }
}
