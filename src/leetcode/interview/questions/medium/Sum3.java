package leetcode.interview.questions.medium;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        System.out.println(new Sum3().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (-nums[i] == nums[j] + nums[k]) {
                    if (i != j && i != k && j != k) {
                        set.add(List.of(nums[i], nums[j], nums[k]));
                    }
                    j++;
                    k--;
                } else if (-nums[i] > nums[j] + nums[k]) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}

