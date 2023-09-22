package litcode.interview.questions.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String s) {
        String[] p = pattern.split("");
        String[] w = s.split(" ");
        if (p.length != w.length) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            String pat = p[i];
            String word = w[i];
            if (map.containsKey(pat)) {
                if (!(map.get(pat).equals(word))) {
                    return false;
                }
            } else {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(pat, word);

            }
        }
        return true;
    }
}
