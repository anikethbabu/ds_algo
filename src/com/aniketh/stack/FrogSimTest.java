package com.aniketh.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogSimTest {
    @Test
    public void test1() {
        FrogSim sim = new FrogSim(30, 5);
        sim.hops = new int []{4,2,-8};
        assertEquals(false,sim.simulate());
    }
    @Test
    public void test2(){
        FrogSim sim = new FrogSim(30, 5);
        sim.hops = new int []{4,2,-8};
    }

}