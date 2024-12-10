package ctci.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int j = n - 1; j > 0; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.printf("%s\n", Arrays.toString(arr));
                if (arr[i - 1] > arr[i]) {
                    swap(i - 1, i, arr);
                }
            }
        }
    }
    private static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
