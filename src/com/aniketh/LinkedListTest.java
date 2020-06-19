package com.aniketh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    public void addFirst() {
        LinkedList lk = new LinkedList();
        lk.AddFront(5);

        assertEquals(5, lk.getHead().data);
        lk.AddFront(123);
        assertEquals(123, lk.getHead().data);
        lk.AddFront(55);
        assertEquals(5, lk.getLast());
        lk.addBack(20);
        assertEquals(20, lk.getLast());
        assertEquals(4, lk.size());
    }

    @Test
    void getFirst() {
        LinkedList lk = new LinkedList();
        lk.getFirst();
    }

    @Test
    void delete() {
        LinkedList lk = new LinkedList();
        lk.addBack(123);
        lk.addBack(21345);
        lk.delete(123);
        assertEquals(21345, lk.getHead().data);
    }

}