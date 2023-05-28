package litcode.interview.questions.easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int sum;
        if (max % 2 == 0) {
            sum = max / 2 * (max + 1);
        } else {
            sum = max * (max + 1) / 2;
        }
        int sum2 = 0;
        for (int i : nums) {
            sum2 += i;
        }
        return sum - sum2;
    }
}
