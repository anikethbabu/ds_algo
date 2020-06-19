package com.aniketh.stack;

public class FrogSim {
    private int goalDistance;
    private int maxHops;
    int[] hops;
    int currentHop = 0;

    public FrogSim(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    int hopDistance() {
        return hops[currentHop++];
    }

    public boolean simulate() {
        for (int i = 0; i >= 0; i += hopDistance()) {
            for (int j = 0; j < maxHops; j++) {
                if (i >= goalDistance) {
                    return true;
                }
            }
        }
        return false;

    }

    public double runSimulations(int num) {
        double countNum = 0;
        double totalNum = num;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                countNum++;
            }
        }
        return countNum/totalNum;
    }


}
