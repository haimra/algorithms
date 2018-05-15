package org.raman.helper;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by haim on 29/04/2018.
 */
public class Utils {

    public static String intArrToCsv(int[] arr) {
        return IntStream.of(arr).mapToObj(String::valueOf).collect(Collectors.joining(","));
    }

    public static int[] arrayWithoutItemInIndex(int arr[], int index) {
        if (index < 0 || index > arr.length - 1) throw new ArrayIndexOutOfBoundsException(index);
        int[] subArr = new int[arr.length - 1];
        if (index > 0) {
            System.arraycopy(Arrays.copyOfRange(arr, 0, index), 0, subArr, 0, index);
        }
        if (index < arr.length - 1) {
            System.arraycopy(Arrays.copyOfRange(arr, index + 1, arr.length), 0, subArr, index, arr.length - index - 1);
        }
        return subArr;
    }
}
