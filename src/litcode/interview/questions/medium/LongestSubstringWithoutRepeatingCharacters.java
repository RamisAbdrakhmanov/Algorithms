package litcode.interview.questions.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "aaaasbcaaa";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = 1;
        int maxLength = 1;
        Set<Character> characters = new HashSet<>();
        characters.add(s.charAt(0));
        while (right < s.length()) {
            char rc = s.charAt(right);
            if (characters.contains(rc)) {
                while (s.charAt(left) != rc && left <= right) {
                    characters.remove(s.charAt(left));
                    left++;
                }
                left++;
            } else {
                characters.add(rc);
                if (characters.size() > maxLength) {
                    maxLength = characters.size();
                }
            }
            right++;
        }

        return maxLength;
    }
}
