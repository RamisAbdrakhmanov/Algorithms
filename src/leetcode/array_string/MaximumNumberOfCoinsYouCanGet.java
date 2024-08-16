package leetcode.array_string;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l = 0;
        int r = piles.length - 2;
        int sum = 0;
        while (l <= r) {
            sum += piles[r];
            r -= 2;
            l++;
        }
        return sum;
    }
}
