package leetcode.two_pointers.medium;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);

        int p = 0;
        int t = 0;
        while (p < players.length && t < trainers.length) {
            if (players[p] <= trainers[t]) {
                t++;
                p++;
            } else {
                t++;
            }
        }

        return p;
    }
}
