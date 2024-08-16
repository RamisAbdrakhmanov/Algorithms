package leetcode.array_string;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans >> num;
        }
        return ans;
    }
}
