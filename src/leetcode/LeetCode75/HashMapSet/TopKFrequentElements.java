package leetcode.LeetCode75.HashMapSet;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        new TopKFrequentElements().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
     /*   PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparing(c -> -c.getValue()));

        queue.addAll(map.entrySet());

        int[] max = new int[k];
        k--;
        while (k >= 0) {
            max[k--] = queue.poll().getKey();
        }*/
        List<Integer>[] lists = new ArrayList[nums.length+1];
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(lists[entry.getValue()] == null){
                lists[entry.getValue()]= new ArrayList<>();
            }
            lists[entry.getValue()].add(entry.getKey());
        }


        int[] max = new int[k];
        for (int i = lists.length-1; i >= 0 && k>=0; i--) {
            if(lists[i] != null){
                for (int val : lists[i]){
                    max[k--] = val;
                }
            }
        }
        return max;
    }
}
