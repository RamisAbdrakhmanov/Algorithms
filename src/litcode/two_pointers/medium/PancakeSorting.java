package litcode.two_pointers.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PancakeSorting {
    public static void main(String[] args) {
        System.out.println(new PancakeSorting().pancakeSort(new int[]{3,2,4,1}));
    }

    public List<Integer> pancakeSort(int[] arr) {
        if (!isUnsorted(arr)) {
            return new ArrayList<>();
        }

        List<Integer> flips = new ArrayList<>();
        int countSorted = 0;
        int firstMinIndex = findMin(arr, countSorted++);
        flip(arr, firstMinIndex);
        flips.add(firstMinIndex + 1);

        while (isUnsorted(arr)) {
            int minIndex = findMin(arr, countSorted++);

            flip(arr, minIndex - 1);
            flips.add(minIndex);

            flip(arr, minIndex);
            flips.add(minIndex + 1);

            flip(arr, countSorted-1);
            flips.add(countSorted);
            flip(arr,countSorted-2);
            flips.add(countSorted-1);
        }

        return flips;
    }

    private int findMin(int[] arr, int start) {

        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    private boolean isUnsorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return true;
            }
        }
        return false;
    }

    private void flip(int[] arr, int r) {
        int l = 0;
        while (l < r) {
            swap(arr, l++, r--);
        }
        System.out.println(Arrays.toString(arr));
    }

    private void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
