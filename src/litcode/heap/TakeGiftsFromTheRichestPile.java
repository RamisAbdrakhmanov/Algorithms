package litcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pr = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(gifts).forEach(pr::add);
        while (k-- != 0) {
            if (pr.isEmpty() || pr.peek() == 0) {
                return 0;
            }
            pr.add((int)Math.sqrt(pr.poll()));
        }
        long sum = 0;
        while (!pr.isEmpty() && pr.peek() != 0 ){
            sum += pr.poll();
        }

        return sum;
    }
}
