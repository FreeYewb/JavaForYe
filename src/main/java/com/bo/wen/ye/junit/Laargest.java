package com.bo.wen.ye.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class Laargest {

    @Before
    public void setUp() throws Exception {
    }


    public static int largest(int[] list) {
        int index, max = Integer.MIN_VALUE;
        if (list.length == 0) {
            throw new RuntimeException("Empty list");
        }
        for (index = 0; index < list.length; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }

    @Test
    public void testSimple2() {
        int[] arr = new int[3];
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 9;
        // assertEquals("错了，预期不对", 10, Laargest.largest(arr));
        assertEquals(9, Laargest.largest(arr));
    }

    @Test
    public void testOrder() {

        assertEquals(9, Laargest.largest(new int[] { 9, 8, 7 }));
        assertEquals(9, Laargest.largest(new int[] { 7, 9, 8 }));
        assertEquals(9, Laargest.largest(new int[] { 7, 8, 9 }));
    }

    @Test
    public void testDups() {

        assertEquals(9, Laargest.largest(new int[] { 9, 8, 7, 9 }));

    }

    @Test
    public void testFmpty() {

        try {
            Laargest.largest(new int[] {});
            fail("Should have thrown an exception");
        }
        catch (Exception e) {
            // TODO: handle exception
            assertTrue(true);
        }

    }

    @Test
    public void testOne() {

        assertEquals(1, Laargest.largest(new int[] { 1 }));

    }

    @Test
    public void testNegative() {

        assertEquals(-7, Laargest.largest(new int[] { -8, -9, -7 }));

    }

}
