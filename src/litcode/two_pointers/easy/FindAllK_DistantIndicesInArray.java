package litcode.two_pointers.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllK_DistantIndicesInArray {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> indexKeyList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key){
                indexKeyList.add(i);
            }
        }

        List<Integer> indexForAns = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < indexKeyList.size(); j++) {
                if(Math.abs( i-indexKeyList.get(j)) <= k){
                    indexForAns.add(i);
                    break;
                }
            }
        }

        return indexForAns;
    }
}
