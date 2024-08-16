package leetcode.heap;

import java.util.PriorityQueue;

public class LargestNumberAfterDigitSwapsByParity {

    public int largestInteger(int num) {

        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();

        splitNumberAndAddToHeap(num, odd, even);

        return getAnswerWithBiggerNumFirst(num, odd, even);
    }


    private void splitNumberAndAddToHeap(int num, PriorityQueue<Integer> odd, PriorityQueue<Integer> even) {
        while (num != 0) {
            if (num % 2 == 0) {
                even.add(num % 10);
            } else {
                odd.add(num % 10);
            }
            num /= 10;
        }
    }

    private int getAnswerWithBiggerNumFirst(int num, PriorityQueue<Integer> odd, PriorityQueue<Integer> even) {
        int res = 0;
        int k = 1;

        while (num != 0) {
            if (num % 2 == 0) {
                res += even.poll() * k;
            } else {
                res += odd.poll() * k;
            }
            k *= 10;
            num /= 10;
        }
        return res;
    }
}
