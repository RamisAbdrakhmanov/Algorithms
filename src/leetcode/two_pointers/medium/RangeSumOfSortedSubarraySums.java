package leetcode.two_pointers.medium;

import java.util.Arrays;

public class RangeSumOfSortedSubarraySums {
    public static void main(String[] args) {
        System.out.println(rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5));
    }

    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] dp = new int[((n * (n + 1)) / 2)];

        int iterator = 1;



        Arrays.sort(dp);

        int sum = 0;
        int mod = 1000000007;

        for (int i = left; i <= right; i++) {
            sum = (sum + dp[i]) % mod;
        }

        return sum;
    }
}
