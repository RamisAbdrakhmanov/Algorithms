package litcode.two_pointers;

import java.util.Arrays;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int left = 0;
        int right = word.indexOf(ch);

        char[] ans = word.toCharArray();
        while (left < right){
            char temp = ans[right];
            ans[right] = ans[left];
            ans[left] = temp;
            left++;
            right--;
        }
        return new String(ans);
    }
}
