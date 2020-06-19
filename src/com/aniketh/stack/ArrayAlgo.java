package com.aniketh.stack;

public class ArrayAlgo {


    public static int findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void rotateLeft(int[] a){
        int first = a[0];
        for (int i = 0; i < a.length - 1  ; i++) {
            a[i] = a[i+1];
        }
        a[a.length - 1] = first;
    }
}
