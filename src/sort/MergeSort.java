package sort;


import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[6];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        a = new MergeSort().sort(a);

        System.out.println(Arrays.toString(a));
    }

    public int[] sort(int[] arr) {
        int[] temp;
        int[] sort = arr;
        int[] sorted = new int[arr.length];
        int size = 1;
        while (size < arr.length) {
            for (int i = 0; i < arr.length; i += size * 2) {
                merge(sort, sorted, i, size);
            }
            temp = sort;
            sort = sorted;
            sorted = temp;

            size *= 2;
        }
        return sort;
    }

    public void merge(int[] arr1, int[] arr2, int start, int size) {
        int start1 = start;
        int end1 = Math.min(start1 + size, arr1.length);

        int start2 = end1;
        int end2 = Math.min(start2 + size, arr1.length);
        for (int i = start1; i < end2; i++) {
            if (start1 < end1 && (start2 >= end2 || arr1[start1] < arr1[start2])) {
                arr2[i] = arr1[start1];
                start1++;
            } else {
                arr2[i] = arr1[start2];
                start2++;
            }
        }
    }
}
