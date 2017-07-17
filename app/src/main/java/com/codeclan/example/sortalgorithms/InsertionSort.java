package com.codeclan.example.sortalgorithms;

/**
 * Created by user on 17/07/2017.
 */

class InsertionSort {
    public static int[] sort(int[] values) {
        for (int i = 1; i < values.length; i++){
            for (int j = i; j > 0 && values[j-1] > values[j]; j--){
                int temp = values[j];
                values[j] = values[j-1];
                values[j-1] = temp;
            }
        }
        return values;
    }
}