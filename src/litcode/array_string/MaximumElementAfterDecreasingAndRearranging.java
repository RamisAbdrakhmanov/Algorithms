package litcode.array_string;

import java.util.Arrays;

public class MaximumElementAfterDecreasingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count <= arr[i]) {
                count++;
            }
        }
        return count;
    }
}
