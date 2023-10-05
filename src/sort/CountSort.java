package sort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        new CountSort().sort(a, 10);
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] arr, int count) {
        int[] counter = new int[count];

        for (int j : arr) {
            counter[j] += 1;
        }

        int iterator = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                counter[i]-=1;
                arr[iterator++] = i;
            }
        }
    }
}
