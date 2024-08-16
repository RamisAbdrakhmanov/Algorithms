package leetcode.two_pointers.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {
    public int distinctAverages(int[] nums) {
        Set<Double> ans = new HashSet<>();
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            ans.add(((double) nums[l++] + nums[r--]) / 2);
        }
        return ans.size();
    }
}
