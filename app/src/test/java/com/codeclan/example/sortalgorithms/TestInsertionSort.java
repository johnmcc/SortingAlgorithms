package com.codeclan.example.sortalgorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by user on 17/07/2017.
 */

public class TestInsertionSort {

    private int[] values;
    private int[] sorted;

    @Before
    public void setUp() throws Exception {
        values = new int[]{9,4,2,3,1,5,7,8,0,6};
        sorted = new int[]{0,1,2,3,4,5,6,7,8,9};
    }

    @Test
    public void testInsertionSort() throws Exception {
        assertArrayEquals(sorted, InsertionSort.sort(values));
    }
}