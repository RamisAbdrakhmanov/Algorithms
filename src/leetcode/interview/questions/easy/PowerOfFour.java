package leetcode.interview.questions.easy;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0 && n != 1) {
            n /= 4;
        }
        return n == 1;
    }
}
