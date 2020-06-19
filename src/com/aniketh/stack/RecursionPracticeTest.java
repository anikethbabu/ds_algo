package com.aniketh.stack;

import com.aniketh.RecursivePractice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionPracticeTest {
    @Test
    void factorial(){
        int n = RecursivePractice.recursiveFactorial(5);
        assertEquals(120,n);
    }

}