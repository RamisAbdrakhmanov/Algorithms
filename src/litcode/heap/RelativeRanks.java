package litcode.heap;

import java.util.PriorityQueue;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pr = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < score.length; i++) {
            pr.add(new int[]{i, score[i]});
        }

        String[] ans = new String[score.length];

        int iter = 1;
        while (!pr.isEmpty()) {
            if (iter > 3) {
                ans[pr.poll()[0]] = String.valueOf(iter++);
            } else if (iter == 3) {
                ans[pr.poll()[0]] = "Bronze Medal";
                iter++;
            } else if (iter == 2) {
                ans[pr.poll()[0]] = "Silver Medal";
                iter++;
            } else if (iter == 1) {
                ans[pr.poll()[0]] = "Gold Medal";
                iter++;
            }
        }

        return ans;
    }
}
