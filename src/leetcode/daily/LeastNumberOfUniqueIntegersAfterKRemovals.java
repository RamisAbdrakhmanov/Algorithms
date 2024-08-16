package leetcode.daily;

import java.util.*;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            k-=list.get(i);
            if(k == 0){
                return list.size() - 1 -i;
            }
            if(k < 0){
                return list.size()-i;
            }
        }
        return 0;
    }
}
