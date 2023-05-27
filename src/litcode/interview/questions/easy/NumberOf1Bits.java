package litcode.interview.questions.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(new NumberOf1Bits().hammingWeight(00000000000000000000000000001011));
    }
    public int hammingWeight(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int count = 0;
        System.out.println(Arrays.toString(arr));
        for(char c : arr){
            System.out.println(c);
            if (c == '1'){
                count++;
            }
        }
        return count;
    }
}
