package litcode.LeetCode75.array_string;

public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }
        int max;
        int secondMax;
        int index;
        if (nums[0] > nums[1]) {
            index = 0;
            max = nums[0];
            secondMax = nums[1];
        } else {
            index = 1;
            max = nums[1];
            secondMax = nums[0];
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max) {
                index = i;
                secondMax = max;
                max = nums[i];
            } else {
                secondMax = Math.max(nums[i], secondMax);
            }
        }

        if (secondMax == 0 || max / secondMax >= 2) {
            return index;
        }
        return -1;
    }
}
