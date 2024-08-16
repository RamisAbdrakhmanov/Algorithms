package leetcode.array_string;

import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        Arrays.sort(nums);

        int poz = 0;
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                poz = nums[i];
            } else {
                sum+=nums[i];
            }
        }

        int needSum = (1+nums.length)*nums.length/2;

        ans[0] = poz;
        ans[1] = needSum - sum;
        return ans;
    }
}
