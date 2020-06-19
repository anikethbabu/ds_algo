package com.aniketh.stack;



import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortPracticeTest {
    @Test
    void sort()
    {
        int[] a = {3,5,1,4,2};
        ArraySortPractice.arrSort(a);
        assertArrayEquals(a, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void inbuiltSort()
    {
        int[] a = {3,5,1,4,2};
        Arrays.sort(a);
        assertArrayEquals(a, new int[]{1, 2, 3, 4, 5});
    }
}