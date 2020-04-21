package com.aniketh.Array;

import com.aniketh.Array.DynamicArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {
    @Test
    public void GetAndSet() {
        DynamicArray array = new DynamicArray(2);
        array.set(0, "Aniketh");
        assertEquals("Aniketh", array.get(0));

    }
    @Test
    public void insert() {
        DynamicArray array = new DynamicArray(5);
        array.insert(0, "Aniketh");
        array.insert(0, "hi");
        assertEquals("hi", array.get(0));
        assertEquals("Aniketh", array.get(1));
    }
}