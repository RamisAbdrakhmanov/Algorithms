package leetcode.arr_2d;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        int time = 0;

        int[] prev = points[0];
        for (int i = 1; i < points.length; i++) {
            int length =  Math.abs(prev[0] - points[i][0]);
            int height = Math.abs(prev[1] - points[i][1]);
            time += Math.max(length,height);
            prev = points[i];
        }

        return time;
    }
}
