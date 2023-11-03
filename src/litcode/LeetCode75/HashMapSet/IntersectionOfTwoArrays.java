package litcode.LeetCode75.HashMapSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums1){
            set.add(num);
        }

        Set<Integer> intersection = new HashSet<>();

        for (int num : nums2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }

        int[] intersec = new int[intersection.size()];
        int k = 0;
        for (Integer i : intersection){
            intersec[k++] = i;
        }
        return intersec;
    }
}
