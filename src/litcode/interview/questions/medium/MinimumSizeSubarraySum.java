package litcode.interview.questions.medium;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                sum -= nums[left];

                if (min > right + 1 - left) {
                    min = right - left + 1;
                }

                left++;
            }
            right++;
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}
