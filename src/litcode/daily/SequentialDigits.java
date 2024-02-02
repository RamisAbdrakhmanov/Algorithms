package litcode.daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(10,Integer.MAX_VALUE));
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int length = 2;
        for (long i = 10; i <= Integer.MAX_VALUE; i *= 10) {
            for (int j = 1; j <= 10 - length; j++) {
                long temp = j;
                int current = 1;
                while (current < length) {
                    temp = temp * 10 + j + current;
                    current++;
                }

                if (temp >= low && temp <= high) {
                    ans.add((int) temp);
                }
            }
            length++;
        }
        return ans;
    }

}
