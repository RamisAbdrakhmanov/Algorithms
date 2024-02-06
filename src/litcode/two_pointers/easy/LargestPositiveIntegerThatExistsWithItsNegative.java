package litcode.two_pointers.easy;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] * -1 == nums[right]) {
                return nums[right];
            } else if (nums[left] * -1 > nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        return -1;
    }
}
