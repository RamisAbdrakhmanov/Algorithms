package litcode.two_pointers.medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();

        int f = 0;
        int s = 0;
        while (f < firstList.length && s < secondList.length) {
            int starF = firstList[f][0];
            int endF = firstList[f][1];

            int starS = secondList[s][0];
            int endS = secondList[s][1];

            if ((starF >= starS && starF <= endS) || (starS >= starF && starS <= endF)) {
                list.add(new int[]{Math.max(starF, starS), Math.min(endS, endF)});
            }

            if (endF > endS) {
                s++;
            } else {
                f++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
