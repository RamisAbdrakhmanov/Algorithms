package leetcode.interview.questions.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        List<int[]> mergeList = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int finish = intervals[i][1];
            while (i + 1 < intervals.length && finish >= intervals[i + 1][0]) {
                i++;
                if (intervals[i][1] > finish) {
                    finish = intervals[i][1];
                }
            }
            mergeList.add(new int[]{start, finish});
        }
        int[][] merge = new int[mergeList.size()][2];
        for (int i = 0; i < mergeList.size(); i++) {
            merge[i][0] = mergeList.get(i)[0];
            merge[i][1] = mergeList.get(i)[1];
        }
        return merge;
    }
}
