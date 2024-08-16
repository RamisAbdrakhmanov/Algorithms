package leetcode.interview.questions.medium;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int costSumAll = 0;
        int gasSumAll = 0;

        int costSumThis = 0;
        int gasSumThis = 0;
        int station = 0;
        for (int i = 0; i < gas.length; i++) {
            costSumAll += cost[i];
            gasSumAll += gas[i];

            costSumThis += cost[i];
            gasSumThis += gas[i];
            if (costSumThis > gasSumThis) {
                gasSumThis = 0;
                costSumThis = 0;
                station = i+1 ;
            }
        }
        if (costSumAll > gasSumAll) {
            return -1;
        } else {
            return station;
        }

    }
}
