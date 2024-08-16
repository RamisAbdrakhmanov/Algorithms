package leetcode.two_pointers.medium;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] index = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            index[chars[i] - 'a'] = i;
        }

        int maxLen = Integer.MIN_VALUE;
        int last = -1;
        for (int i = 0; i < chars.length; i++){
            maxLen = Math.max(maxLen, index[chars[i] - 'a']);

            if (i == maxLen){
                result.add(i - last);
                last = i;
            }
        }

        return result;
    }
}
