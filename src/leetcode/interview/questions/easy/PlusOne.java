package leetcode.interview.questions.easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] != 0) {
            return digits;
        } else {
            int[] newDig = new int[digits.length + 1];
            newDig[0] = 1;
            for (int i = 1; i < newDig.length; i++) {
                newDig[i] = digits[i-1];
            }
            return newDig;
        }

    }
}
