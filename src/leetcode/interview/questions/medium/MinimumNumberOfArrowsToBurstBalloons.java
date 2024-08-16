package leetcode.interview.questions.medium;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int arrows = 1;
        int finish = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (finish >= points[i][0]) {
                arrows++;
                finish = points[i][1];
            }
        }
        return arrows;
    }
}
