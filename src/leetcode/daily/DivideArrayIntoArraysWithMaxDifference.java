package leetcode.daily;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[nums.length / 3][3];
        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i] + k < nums[i + 2] ) {
                return new int[][]{};
            }
            System.arraycopy(nums, i, ans[i / 3], 0, 3);
        }
        return ans;
    }
}
