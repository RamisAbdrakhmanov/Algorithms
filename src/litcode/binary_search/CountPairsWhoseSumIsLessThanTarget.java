package litcode.binary_search;

import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int count = 0;

        int left = 0;
        int right = nums.size() - 1;

        int temp = 0;
        while (left < right) {
            if (nums.get(right) + nums.get(left) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;

    }
}
