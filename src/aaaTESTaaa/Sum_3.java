package aaaTESTaaa;

import sort.Bubble;

import java.util.*;

public class Sum_3 {

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deque = new LinkedList<>();
        Collections.sort((LinkedList<Integer>) deque);
        LinkedList<Integer> linkedList = (LinkedList<Integer>) deque;
        linkedList.add(123);
        Collections.sort(linkedList);


        int[] a = new int[100];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = (int) (Math.random() * 99);
        }
        System.out.println(threeSum(a));

    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        List<List<Integer>> ans = set.stream().toList();

        return ans;
    }
}
