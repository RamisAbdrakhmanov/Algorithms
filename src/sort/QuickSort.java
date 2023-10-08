package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i <=a.length - 1; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(a));
        new QuickSort().sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = quick(arr, left, right);
            sort(arr, left, mid - 1);
            sort(arr, mid, right);
        }

    }

    public int quick(int[] arr, int left, int right) {
        int mid = arr[left+(right - left) / 2];
        while (left <= right) {
            while (arr[left] < mid) {
                left++;
            }

            while (arr[right] > mid) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
