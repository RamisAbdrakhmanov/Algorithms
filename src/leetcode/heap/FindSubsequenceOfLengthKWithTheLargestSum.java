package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindSubsequenceOfLengthKWithTheLargestSum {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((i1, i2) -> i2[0] - i1[0]);
        int[] ans = new int[k];

        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(new int[]{nums[i], i});
        }

        PriorityQueue<int[]> priorityQueue1 = new PriorityQueue<>(Comparator.comparingInt(i -> i[1]));
        while (k-- != 0){
            priorityQueue1.add(priorityQueue.poll());
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = priorityQueue1.poll()[0];
        }
        return ans;
    }
}
