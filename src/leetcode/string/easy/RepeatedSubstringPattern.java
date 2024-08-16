package leetcode.string.easy;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String str) {
        if(str.length() < 2 || str.length()%2 == 1){
            return false;
        }
        int[] arr = new int[26];
        for (char c : str.toCharArray()) {
            arr[c - 'a']++;
        }
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if(i != 0) {
                min = Math.min(min, i);
            }
            if(min == 1){
                return false;
            }
        }

        String s = str.substring(0, str.length() / min + 1);
        StringBuilder sb = new StringBuilder();
        while (min-- > 0) {
            sb.append(s);
        }
        return sb.toString().equals(str);
    }
}
