package leetcode.array_string;

import java.util.Set;

public class ReversVowelsOfAString {

    public String reverseVowels(String s) {
       char[] c = s.toCharArray();
       int left = 0;
       int right = c.length-1;

       Set<Character> chars = Set.of('a','e','i','o','u','A','E','I','O','U');

       while (left<right){
           while (left<right && !chars.contains(c[left])){
               left++;
           }

           while (left<right && !chars.contains(c[right])){
               right--;
           }

           swap(c,left,right);
           left++;
           right--;
       }

       return new String(c);
    }

    public void swap(char[] c, int l1 , int l2){
        char temp = c[l1];
        c[l1] = c[l2];
        c[l2] = temp;
    }
}
