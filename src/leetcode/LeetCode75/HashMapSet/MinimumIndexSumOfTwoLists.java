package leetcode.LeetCode75.HashMapSet;

import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> stringsList1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            stringsList1.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        int count = 1;
        for (int i = 0; i < list2.length; i++) {
            if (stringsList1.containsKey(list2[i])) {
                if(stringsList1.get(list2[i]) + i == min){
                    count++;
                } else  if(stringsList1.get(list2[i]) + i < min){
                    min = stringsList1.get(list2[i]) + i;
                    count = 1;
                }
            }
        }

        String[] commonString = new String[count];

        int k = 0;
        for (int i = 0; i < list2.length; i++) {
            if (stringsList1.containsKey(list2[i])) {
                if(stringsList1.get(list1[i]) + i == min){
                   commonString[k++] = list2[i];
                }
            }
        }

        return commonString;
    }
}
