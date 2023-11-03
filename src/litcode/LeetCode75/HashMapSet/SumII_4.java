package litcode.LeetCode75.HashMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumII_4 {
    public static void main(String[] args) {
        System.out.println(new SumII_4().fourSumCount(new int[]{ 0},new int[]{0},new int[]{0},new int[]{0}));
    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int k : nums1) {
            for (int i : nums2) {
                map1.put(k + i, map1.getOrDefault(k + i, 0) + 1);
            }
        }
        int count = 0;

        for (int k : nums3) {
            for (int i : nums4) {
                    count += map1.getOrDefault(-(k+i), 0);
            }
        }

        return count;
    }

}
