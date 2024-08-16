package leetcode.LeetCode75.HashMapSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> temp = new ArrayList<>();

        for (int num : set1) {
            if (set2.contains(num)) {
                set2.remove(num);
            } else {
                temp.add(num);
            }
        }

        result.add(temp);
        result.add(new ArrayList<>(set2));
        return result;
    }
}
