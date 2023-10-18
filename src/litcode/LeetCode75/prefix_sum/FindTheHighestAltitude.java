package litcode.LeetCode75.prefix_sum;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }
}
