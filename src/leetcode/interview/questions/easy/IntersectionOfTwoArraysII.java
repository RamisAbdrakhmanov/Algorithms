package leetcode.interview.questions.easy;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.containsKey(i)){
                if(map.get(i)>0){
                    list.add(i);
                    map.put(i,map.get(i)-1);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return  arr;
    }
}
