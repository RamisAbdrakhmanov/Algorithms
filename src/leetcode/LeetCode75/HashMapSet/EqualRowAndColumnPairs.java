package leetcode.LeetCode75.HashMapSet;

import java.util.*;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int ans = 0, n = grid.length;
        Map<List<Integer>, Integer> col = new HashMap<>();
        for(int i = 0; i < n; i++) {
            List<Integer> c = new ArrayList<>();
            for (int[] ints : grid) {
                c.add(ints[i]);
            }
            col.put(c, col.getOrDefault(c, 0) + 1);
        }


        for(int[] row : grid) {
            List<Integer> r = new ArrayList<>();
            for(int num : row) {
                r.add(num);
            }
            if(col.containsKey(r)) {
                ans += col.get(r);
            }
        }
        return ans;
    }

}
