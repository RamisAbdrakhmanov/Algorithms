package leetcode.interview.questions.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        if (ch.length < 2) {
            return true;
        }
        for (int i = 0; i <= (ch.length / 2); i++) {
            if (ch[i] != ch[ch.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
