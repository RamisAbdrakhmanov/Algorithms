package litcode.heap;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public static void main(String[] args) {
        System.out.println(new MakeArrayZeroBySubtractingEqualAmounts().minimumOperations(new int[]{1, 2, 3, 4, 5}));
    }

    public int minimumOperations(int[] nums) {

        Arrays.sort(nums);

        int max = nums[nums.length - 1];
        int sumDeleted = 0;
        int index = -1;
        int step = 0;

        while (max > 0) {

            index = getNextMin(nums, sumDeleted, index + 1);
            int del = nums[index] - sumDeleted;
            max -= del;
            step++;
            sumDeleted += del;
        }

        return step;
    }

    private int getNextMin(int[] arr, int target, int l) {
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if ( target >= arr[m] && target < arr[m + 1]) {
                return m+1;
            }

            if (arr[m] <= target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }
}
