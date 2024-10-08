package leetcode.LeetCode75.two_pointer;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }

        while (slow < nums.length) {
            nums[slow++] = 0;
        }
    }
}
