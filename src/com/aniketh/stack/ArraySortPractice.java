package com.aniketh.stack;

public class  ArraySortPractice {


    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 1, 4, 6};
        printArray(arrSort(arr));
    }

    static int[] arrSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }
}
