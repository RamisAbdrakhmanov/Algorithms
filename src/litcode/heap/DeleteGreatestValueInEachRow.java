package litcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DeleteGreatestValueInEachRow {
    public int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer>[] priorityQueues = new PriorityQueue[grid.length];
        for (int i = 0; i < grid.length; i++) {
            priorityQueues[i] = new PriorityQueue<>(Comparator.reverseOrder());
            for (int j = 0; j < grid[i].length; j++) {
                priorityQueues[i].add(grid[i][j]);
            }
        }

        int sum = 0;

       while (!priorityQueues[0].isEmpty()){
            int max = priorityQueues[0].poll();
            for (int j = 1; j < priorityQueues.length; j++) {
                max = Math.max(max, priorityQueues[j].poll());
            }
            sum += max;
        }

        return sum;
    }
}
