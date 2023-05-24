package litcode.algorithmOne.TwoPointers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                if(set.size()>count){
                    count = set.size();
                }
            }else {

                set.clear();
                i--;
            }
        }
        return count;
    }
}
