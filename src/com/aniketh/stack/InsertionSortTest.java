package com.aniketh.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    void insert(){
        int[] array = {1,3,5,2};
        InsertionSort.insert(array);
        assertArrayEquals(new int[]{1,2,3,5}, array );
    }

}