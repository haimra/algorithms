package org.raman.algorithim.general;

import org.raman.helper.Utils;

/**
 * Created by haim on 23/04/2018.
 * Given a set of N digits output all possible permutations of those digits
 * Remark: assume all digits are different
 */
public class SetPermutations {

    public static void main(String[] args) {
        SetPermutations sp = new SetPermutations();
        final int[] arr = {1, 2, 3, 4};
        sp.permute(arr, 0, arr.length - 1);
        System.out.println("Total number of permutations " + numberOfPermutations);
    }


    static int numberOfPermutations = 0;

    private void permute(int[] arr, int l, int r) {
        if (l == r) {
            numberOfPermutations++;
            System.out.println(Utils.intArrToCsv(arr));
        } else {
            for (int i = l; i <= r; i++) {
                arr = swap(arr, l, i);
                permute(arr, l + 1, r);
                arr = swap(arr, l, i);
            }
        }
    }

    public int[] swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
