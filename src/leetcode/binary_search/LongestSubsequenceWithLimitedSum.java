package leetcode.binary_search;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] sum = prefixSum(nums);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length ; i++) {
            ans[i] = indexOfLastLess(sum,queries[i]);
        }

        return ans;
    }

    private int[] prefixSum(int[] nums){
        int[] pref = new int[nums.length+1];
        for (int i = 0; i < nums.length ; i++) {
            pref[i+1] = pref[i] + nums[i];
        }
        return pref;
    }

    private int indexOfLastLess(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (r >= l) {
            int m = l + (r - l) / 2;
            if (arr[m] <= target && (m == arr.length - 1 || arr[m + 1] > target)) {
                return m;
            } else if (arr[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return 0;
    }
}
