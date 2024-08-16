package leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        String f = "qwertyuiop";
        String s = "asdfghjkl";
        String t = "zxcvbnm";

        mark:
        for (String word : words) {
            String it;
            if (f.contains(Character.toString(Character.toLowerCase(word.charAt(0))))) {
                it = f;
            } else if (s.contains(Character.toString(Character.toLowerCase(word.charAt(0))))) {
                it = s;
            } else {
                it = t;
            }

            for (char c : word.toCharArray()) {
                if (!it.contains(Character.toString(Character.toLowerCase(c)))) {
                    continue mark;
                }
            }
            ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}
