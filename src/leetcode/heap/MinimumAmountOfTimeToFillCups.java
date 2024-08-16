package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumAmountOfTimeToFillCups {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int j : amount) {
            priorityQueue.add(j);
        }
        int count = 0;
        while (priorityQueue.peek() != 0) {
            count++;
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            priorityQueue.add(--first);
            priorityQueue.add(--second);
        }
        return count;
    }
}
