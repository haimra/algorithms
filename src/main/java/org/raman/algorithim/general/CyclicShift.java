package org.raman.algorithim.general;

import org.raman.helper.Utils;

/**
 * Created by haim on 28/04/2018.
 */
public class CyclicShift {

    /**
     * Although correct not very effect
     * Complexity of O(n*k)
     *
     * @param arr
     * @param c
     * @return
     */
    public int[] shiftRightOn2(int[] arr, int c) {
        while (c > 0 && arr.length != 0) {
            if (c > arr.length) {
                //in-case we are doing more them one round
                //we should remove full rounds and stay with module
                c = c % arr.length;
            }
            for (int i = arr.length - 1; i > 0; i--) {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = tmp;
            }
            System.out.println(Utils.intArrToCsv(arr));
            c--;
        }
        return arr;
    }

    /**
     * O(n) solution, in order to gain faster complexity
     * We required to add O(n) of memory complexity
     *
     * @param arr
     * @param c
     * @return
     */
    public int[] shiftRightOn(int[] arr, int c) {
        if (c > 0 && arr.length != 0) {
            if (c > arr.length) {
                //in-case we are doing more them one round
                //we should remove full rounds and stay with module
                c = c % arr.length;
            }
            int[] shiftArr = new int[arr.length];

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(Utils.intArrToCsv(shiftArr));
                int targetIndex = i + c;
                if (targetIndex >= arr.length) {
                    targetIndex = targetIndex - arr.length;
                }
                shiftArr[targetIndex] = arr[i];
            }
            return shiftArr;
        }
        return arr;
    }
}
