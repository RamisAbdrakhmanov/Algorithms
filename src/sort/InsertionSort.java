package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[25];
        for (int i = 0; i <=a.length - 1; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        new InsertionSort().sort(a);
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int numb = arr[i];
            int iter = i;
            while (iter > 0 && numb < arr[iter-1]) {
                arr[iter] = arr[iter-1];
                iter--;
            }
            arr[iter] = numb;
        }
    }
}
