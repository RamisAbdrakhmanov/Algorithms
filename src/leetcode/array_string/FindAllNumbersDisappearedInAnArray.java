package leetcode.array_string;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] b = new boolean[nums.length];
        for(int i : nums){
            b[i-1] = true;
        }

        for(int i = 0; i < b.length; i++){
            if(!b[i]){
                list.add(i+1);
            }
        }
        return list;
    }
}
