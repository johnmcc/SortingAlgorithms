package com.codeclan.example.sortalgorithms;

/**
 * Created by user on 17/07/2017.
 */

class BubbleSort {
    public static int[] sort(int[] values) {
        if(values == null){
            throw new IllegalArgumentException();
        }

        boolean sortFlag = true;

        while(sortFlag){
            sortFlag = false;
            for(int i=0; i<values.length-1; i++){
                int current = values[i];
                int next = values[i+1];
                if(next < current){
                    values[i] = next;
                    values[i+1] = current;

                    sortFlag = true;
                }
            }
        }

        return values;
    }
}
