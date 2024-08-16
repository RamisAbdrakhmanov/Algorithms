package leetcode.interview.questions.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rn = new HashMap<>();
        HashMap<Character, Integer> m = new HashMap<>();

        wordToMap(magazine, m);
        wordToMap(ransomNote, rn);

        for (Map.Entry<Character, Integer> entry : rn.entrySet()) {
            if (m.containsKey(entry.getKey())) {
                if (entry.getValue() > m.get(entry.getKey())) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private void wordToMap(String ransomNote, HashMap<Character, Integer> rn) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (rn.containsKey(c)) {
                rn.put(c, rn.get(c) + 1);
            } else {
                rn.put(c, 1);
            }
        }
    }
}
