package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if(a != b){
                pq.add(a-b);
            }
        }

        if(pq.isEmpty()){
            return 0;
        } else {
            return pq.peek();
        }
    }
}
