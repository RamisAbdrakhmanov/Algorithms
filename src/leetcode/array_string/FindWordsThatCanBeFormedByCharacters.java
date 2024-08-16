package leetcode.array_string;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = getMapFromString(chars);
        int result = 0;
        for (String word : words) {
            Map<Character, Integer> map2 = getMapFromString(word);
            if (isContains(map, map2)) {
                result += word.length();
            }
        }

        return result;
    }

    private Map<Character, Integer> getMapFromString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }

    private boolean isContains(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if (!map1.containsKey(entry.getKey()) || map1.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
