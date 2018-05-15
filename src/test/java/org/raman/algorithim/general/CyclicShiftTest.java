package org.raman.algorithim.general;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
import static org.raman.helper.Utils.*;

/**
 * Created by haim on 28/04/2018.
 */
public class CyclicShiftTest {

    @Test
    public void testShiftOn2() {
        CyclicShift cyclicShift = new CyclicShift();
        int[] shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{3, 8, 9, 7, 6}, 4);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{8, 9, 7, 6, 3});

        shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{3, 8, 9, 7, 6}, 1);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{6, 3, 8, 9, 7});

        shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{3, 8, 9, 7, 6}, 5);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{3, 8, 9, 7, 6});

        shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{8, 9, 7, 6, 3}, 6);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{3, 8, 9, 7, 6});

        shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{8, 9, 7, 6, 3}, 11);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{3, 8, 9, 7, 6});

        shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{1, 2, 3, 4}, 4);
        System.out.println(intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{1, 2, 3, 4});

        shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{}, 2);
        System.out.println(intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{});

        shiftRightTimes = cyclicShift.shiftRightOn2(new int[]{0, 0, 0}, 1);
        System.out.println(intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{0, 0, 0});

    }

    @Test
    public void testShiftOn() {
        CyclicShift cyclicShift = new CyclicShift();
        int[] shiftRightTimes = cyclicShift.shiftRightOn(new int[]{3, 8, 9, 7, 6}, 4);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{8, 9, 7, 6, 3});

        shiftRightTimes = cyclicShift.shiftRightOn(new int[]{3, 8, 9, 7, 6}, 1);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{6, 3, 8, 9, 7});

        shiftRightTimes = cyclicShift.shiftRightOn(new int[]{3, 8, 9, 7, 6}, 5);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{3, 8, 9, 7, 6});

        shiftRightTimes = cyclicShift.shiftRightOn(new int[]{8, 9, 7, 6, 3}, 6);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{3, 8, 9, 7, 6});

        shiftRightTimes = cyclicShift.shiftRightOn(new int[]{8, 9, 7, 6, 3}, 11);
        System.out.println("Got: " + intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{3, 8, 9, 7, 6});

        shiftRightTimes = cyclicShift.shiftRightOn(new int[]{1, 2, 3, 4}, 4);
        System.out.println(intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{1, 2, 3, 4});

        shiftRightTimes = cyclicShift.shiftRightOn(new int[]{}, 2);
        System.out.println(intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{});

        shiftRightTimes = cyclicShift.shiftRightOn(new int[]{0, 0, 0}, 1);
        System.out.println(intArrToCsv(shiftRightTimes));
        assertArrayEquals(shiftRightTimes, new int[]{0, 0, 0});


    }
}