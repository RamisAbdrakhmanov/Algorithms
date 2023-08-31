package litcode.interview.questions.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 2);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        Set<Character> set = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                set.add(entry.getKey());
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
