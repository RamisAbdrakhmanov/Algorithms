package leetcode.LeetCode75.HashMapSet;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] counter = new int[2001];
        for (int j : arr) {
            counter[j + 1000] += 1;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : counter) {
            if (i != 0) {
                if (!set.add(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
