package litcode.interview.questions.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberIfGoodPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += map.get(nums[i]);
        }

        return sum;
    }
}
