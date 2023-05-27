package litcode.interview.questions.easy;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int numb = nums[0];
        int max = 0;
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }

            if (map.get(i) >= max) {
                numb = i;
                max = map.get(i);
            }
        }
        return numb;
    }
}
