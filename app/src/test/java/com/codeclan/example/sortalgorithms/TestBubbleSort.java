package com.codeclan.example.sortalgorithms;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by user on 17/07/2017.
 */

public class TestBubbleSort {
    int[] values;
    int[] sorted;

    @Before
    public void setUp() throws Exception {
        values = new int[]{9,4,2,3,1,5,7,8,0,6};
        sorted = new int[]{0,1,2,3,4,5,6,7,8,9};
    }

    @Test
    public void testBubbleSort() throws Exception {
        int[] expected = new int[]{0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expected, BubbleSort.sort(values));
    }

    @Test
    public void testSortedArray() throws Exception {
        assertArrayEquals(sorted, BubbleSort.sort(sorted));
    }

    @Test
    public void testNull() throws Exception {
        try{
            assertArrayEquals(null, BubbleSort.sort(null));
            fail();
        }catch(IllegalArgumentException e){

        }
    }
}
