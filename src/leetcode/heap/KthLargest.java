package leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {

    PriorityQueue<Integer> firstKElements;

    public KthLargest(int k, int[] nums) {
        firstKElements = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        if (nums.length > 0) {
            Arrays.sort(nums);
            for (int i = nums.length - 1; i >= nums.length - k; i--) {
                firstKElements.add(nums[i]);
            }
        }
    }

    public int add(int val) {
        if (firstKElements.isEmpty()) {
            firstKElements.add(val);
        }

        if (val > firstKElements.peek()) {
            firstKElements.poll();
            firstKElements.add(val);
        }
        return firstKElements.peek();
    }
}
