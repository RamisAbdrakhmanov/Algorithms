package sort;

import java.util.Arrays;

public class MergeSort2 {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int pivot = nums.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] right = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int sortedIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                sorted[sortedIndex++] = left[leftIndex++];
            } else {
                sorted[sortedIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            sorted[sortedIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            sorted[sortedIndex++] = right[rightIndex++];
        }

        return sorted;
    }


}
