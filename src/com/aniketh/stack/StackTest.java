package com.aniketh.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void push(){
        Stack s = new Stack(32);
        s.push("Hello");
        s.push("Dude");
        assertEquals("Dude", s.pop());
        assertEquals("Hello", s.pop());


    }
}
