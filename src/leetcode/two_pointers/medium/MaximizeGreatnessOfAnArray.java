package leetcode.two_pointers.medium;

import java.util.Arrays;

public class MaximizeGreatnessOfAnArray {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);

        int fast = nums.length - 2;
        int slow = nums.length - 1;

        int count = 0;

        while (fast >= 0) {
            if (nums[slow] > nums[fast]) {
                count++;
                slow--;
                fast--;
            } else {
                fast--;
            }
        }
        return count;
    }
}
