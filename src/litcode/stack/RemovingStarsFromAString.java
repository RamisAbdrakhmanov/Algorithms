package litcode.stack;

import java.util.Stack;

public class RemovingStarsFromAString {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c :  s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(c);
            }
        }
        return String.valueOf(sb);
    }
}
