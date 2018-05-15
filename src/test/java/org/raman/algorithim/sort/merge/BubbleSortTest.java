package org.raman.algorithim.sort.merge;

import org.junit.Assert;
import org.junit.Test;
import org.raman.helper.Utils;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sortWorseCase() {
        final int[] arr = {8, 7, 5, 6};
        BubbleSort.sort(arr);
        System.out.println(Utils.intArrToCsv(arr));
        Assert.assertArrayEquals("Unexpected sorted array",new int[]{5,6,7,8},arr);
    }



    @Test
    public void sortAverageCase() {
        final int[] arr = {5, 7, 8, 3};
        BubbleSort.sort(arr);
        System.out.println(Utils.intArrToCsv(arr));
        Assert.assertArrayEquals("Unexpected sorted array",new int[]{3,5,7,8},arr);
    }

    @Test
    public void sortSorted() {
        final int[] arr = {3,5,7,8};
        BubbleSort.sort(arr);
        System.out.println(Utils.intArrToCsv(arr));
        Assert.assertArrayEquals("Unexpected sorted array",new int[]{3,5,7,8},arr);
    }

    @Test
    public void sortEmpty() {
        final int[] arr = {};
        BubbleSort.sort(arr);
        System.out.println(Utils.intArrToCsv(arr));
        Assert.assertArrayEquals("Unexpected sorted array",new int[]{},arr);
    }

    @Test
    public void sortWithDuplicates() {
        final int[] arr = {5,6,7,5,6,7};
        BubbleSort.sort(arr);
        System.out.println(Utils.intArrToCsv(arr));
        Assert.assertArrayEquals("Unexpected sorted array",new int[]{5,5,6,6,7,7},arr);
    }
}