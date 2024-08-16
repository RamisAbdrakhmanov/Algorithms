package leetcode.binary_search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumArrayLengthAfterPairRemovals {
    public int minLengthAfterRemovals(List<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,-1)+1);
        }

        int repeatCounter = map.values().stream().reduce(0,Integer::sum);
        if(nums.size()/2 < repeatCounter){
            return nums.size()-repeatCounter;
        }else {
            return nums.size()%2;
        }
    }
}
