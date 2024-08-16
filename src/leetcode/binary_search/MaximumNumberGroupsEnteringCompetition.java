package leetcode.binary_search;

import java.util.Arrays;

public class MaximumNumberGroupsEnteringCompetition {
    public static void main(String[] args) {
        System.out.println(maximumGroups(new int[]{10,6,12,7,3,5}));
    }
    public static int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int count = 1;
        int prev = grades[0];
        int prevlength = 1;
        int thisLength = 0;
        int accumulate = 0;
        for(int i = 1; i < grades.length; i++ ){
            accumulate += grades[i];
            thisLength ++;
            if(accumulate > prev && thisLength  > prevlength ){
                count++;
                prevlength = thisLength;
                prev = accumulate;
                accumulate = 0;
                thisLength = 0;
            }
        }

        return count;
    }
}
