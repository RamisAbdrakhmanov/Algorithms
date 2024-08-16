package leetcode.two_pointers.easy;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[even] = nums[i];
                even += 2;
            } else {
                ans[odd] = nums[i];
                odd += 2;
            }
        }
        return ans;
    }

  /*  public int[] sortArrayByParityII(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != i % 2) {
                for (int j = i + 1; j < nums.length; j += 2) {
                    if (nums[j] % 2 != j % 2) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }*/

}
