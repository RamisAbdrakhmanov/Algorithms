package litcode.array_string;

import java.util.Arrays;

public class FindTheWinnerOfAnArrayGame {
    public int getWinner(int[] arr, int k) {
        if (k == 1) {
            return Math.max(arr[0], arr[1]);
        }

        if (k >= arr.length) {
            return Arrays.stream(arr).max().getAsInt();
        }
        int currentWinner = arr[0];
        int consecutiveWins = 0;
        for (int i = 1; i < arr.length; i++) {
            if (currentWinner > arr[i]) {
                consecutiveWins++;
            } else {
                currentWinner = arr[i];
                consecutiveWins = 1;
            }

            if (consecutiveWins == k) {
                return currentWinner;
            }
        }
        return currentWinner;
    }
}
