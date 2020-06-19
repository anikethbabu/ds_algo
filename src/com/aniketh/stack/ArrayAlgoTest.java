package com.aniketh.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAlgoTest {
    @Test
    void min() {
        int[] a = {3, 5, 1, 4, 2};
        int min = ArrayAlgo.findMin(a);
        assertEquals(min, 1);
    }

    @Test
    void max() {
        int[] a = {3, 5, 1, 4, 2};
        int max = ArrayAlgo.findMax(a);
        assertEquals(max, 5);
    }
    @Test
    void rotate()
    {
        int[] a = {3,5,1,4,2};
        ArrayAlgo.rotateLeft(a);
        assertArrayEquals(a, new int[]{5, 1, 4, 2, 3});
    }
}