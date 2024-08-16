package leetcode.interview.questions.medium;

import java.util.Objects;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1329999999));
    }
    public int reverse(int x) {
        String[] s = String.valueOf(x).split("");
        if (!Objects.equals(s[0], "-")) {
            swapArr(s, 0);
        } else {
            swapArr(s, 1);
        }
        try {
            return Integer.parseInt(String.join("", s));
        }catch (NumberFormatException e){
            return 0;
        }
    }

    public void swapArr(String[] s, int start) {
        for (int i = 0; i < s.length / 2; i++) {
            String swap = s[start + i];
            s[start + i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = swap;
        }
    }
}
