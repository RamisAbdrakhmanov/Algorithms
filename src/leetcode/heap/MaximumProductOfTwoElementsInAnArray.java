package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                integers.add((nums[i]-1)*(nums[j]-1));
            }
        }
        return integers.peek();
    }
}
