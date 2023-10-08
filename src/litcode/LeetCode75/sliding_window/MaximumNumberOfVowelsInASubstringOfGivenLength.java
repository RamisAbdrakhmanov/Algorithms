package litcode.LeetCode75.sliding_window;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int lengthVowels = 0;

        int left = 0;
        int right = k - 1;

        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])) {
                lengthVowels++;
            }
        }
        right++;
        int maxLengthVowels = lengthVowels;

        while (right < s.length()) {
            if(isVowel(chars[right])){
                lengthVowels++;
            }
            right++;
            if(isVowel(chars[left])){
                lengthVowels--;
            }
            left++;
            if(lengthVowels > maxLengthVowels){
                maxLengthVowels = lengthVowels;
            }
        }
        return maxLengthVowels;
    }

    private boolean isVowel(char in){
        return in =='a' ||in =='e' ||in =='i' ||in =='o' ||in =='u' ;
    }
}
