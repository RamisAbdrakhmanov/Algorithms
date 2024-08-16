package leetcode.two_pointers.medium;

import java.util.*;

public class LongestStringChain {
    HashMap<String, Integer> memory = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new LongestStringChain().longestStrChain(new String[]{"abcd","dbqca"}));
    }

    public int longestStrChain(String[] words) {

        HashMap<Integer, List<String>> map = new HashMap<>();

        int max = 0;

        for (String word : words) {
            if (!map.containsKey(word.length())) {
                map.put(word.length(), new ArrayList<>());
            }
            map.get(word.length()).add(word);

        }

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            for (String s : entry.getValue()) {
                int count = countWordChain(map, s, entry.getKey() - 1, 1);
                memory.put(s, count);
                max = Math.max(max, count);
            }
        }

        return max;
    }

    private int countWordChain(HashMap<Integer, List<String>> map, String str, int level, int count) {
        if (!map.containsKey(level)) {
            return count;
        }

        char[] c = str.toCharArray();

        List<String> candidates = map.get(level);

        int max = count;
        for (String candidate : candidates) {
            if (isSubstring(c, candidate.toCharArray())) {
                if (memory.containsKey(candidate)) {
                    max = Math.max(max, count + memory.get(candidate));
                } else {
                    max = Math.max(max, countWordChain(map, candidate, level - 1, count + 1));
                }
            }
        }

        return max;
    }

    private boolean isSubstring(char[] str, char[] substr) {
        int s = 0;
        int subs = 0;

        int mistake = 1;

        while (subs < substr.length) {
            if (str[s] != substr[subs]) {
                mistake--;
                if (mistake < 0) {
                    return false;
                }
            } else {
                subs++;
            }
            s++;

        }

        return true;
    }
}
