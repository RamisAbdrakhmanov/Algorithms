package litcode.LeetCode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
