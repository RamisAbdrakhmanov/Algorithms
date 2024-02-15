package litcode.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        System.out.println(largestDivisibleSubset(new int[]{4, 8, 10, 240}));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        int[][] dp = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[j][0] + 1 > dp[i][0]) {
                    dp[i][0] = dp[j][0] + 1;
                    dp[i][1] = j;
                }
            }
        }


        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][0] > dp[max][0]) {
                max = i;
            }
        }


        List<Integer> ans = new ArrayList<>();

        while (dp[max][0] != 0) {
            ans.add(nums[max]);
            max = dp[max][1];
        }
        ans.add(nums[max]);

        Collections.reverse(ans);

        return ans;
    }
}
