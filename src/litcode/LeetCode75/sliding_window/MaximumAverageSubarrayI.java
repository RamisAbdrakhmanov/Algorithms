package litcode.LeetCode75.sliding_window;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{-1}, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        double sum = 0;
        for (int i = 0; i <= k - 1; i++) {
            sum += nums[i];
        }
        right++;
        double maxAvg = sum / k;
        while (right < nums.length) {
            sum += nums[right];
            sum -= nums[left];
            if (sum / k > maxAvg) {
                maxAvg = sum;
            }
            right++;
            left++;
        }
        return maxAvg/k;
    }
}
