package org.raman.algorithim.sort.merge;

/**
 * Bubble sort
 * Worst-case performance	O(n^2)
 * Best-case performance	O(n)
 * Average performance	O(n^{2})
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list to be sorted,
 * compares each pair of adjacent items and swaps them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
 */
public class BubbleSort {

    public static void sort(int arr[]) {
        int j = 0;
        boolean swapped = true;
        while (j < arr.length - 1&& swapped) {
            swapped = false;
            for (int i = j; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                    swapped = true;
                    System.out.print(".");
                }
            }
        }

        System.out.println("\nDone");
    }

    private static void swap(int arr[], int index) {
        int temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

}
