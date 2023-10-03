package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = (int) (Math.random() * 1000);
        }
        new SelectionSort().sort(a);
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = index(arr, i);
            int swap = arr[i];
            arr[i] = arr[min];
            arr[min] = swap;
        }
    }

    public int index(int[] arr, int start) {
        int idx = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[idx] > arr[i]) {
                idx = i;
            }
        }
        return idx;
    }
}
