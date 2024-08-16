package leetcode.string.easy;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        if (Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            return false;
        }
        for (int i = 2; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i - 1))) {
                return false;
            }
            if (Character.isLowerCase(word.charAt(i - 1)) && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
