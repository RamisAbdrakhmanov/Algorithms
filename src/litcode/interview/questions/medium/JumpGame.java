package litcode.interview.questions.medium;

import java.io.PrintStream;

public class JumpGame {
    public static void main(String[] args) {
        int[] s = {1, 1, 0, 1};
        System.out.println(new JumpGame().canJump(s));
    }

    public boolean canJump(int[] nums) {
        int sum = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {

            if (i + nums[i] > sum) {
                sum = i + nums[i];
            }
            if (sum <= i) {
                return false;
            }
        }
        return true;
    }
}
