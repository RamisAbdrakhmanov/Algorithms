package sort;

import java.util.Arrays;

//Сортировка расческой
public class CombSort {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = (int) (Math.random() * 1000);
        }
        new CombSort().sort(a);
        System.out.println(Arrays.toString(a));
    }

    private void sort(int[] arr) {
        int gap = arr.length;

        boolean isSorted = false;
        while (!isSorted || gap != 1) {
            if (gap > 1) {
                gap = gap * 10 / 13;
            } else {
                gap = 1;
            }
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int swap = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swap;
                        isSorted = false;
                    }
                }
            }
        }
    }
}
