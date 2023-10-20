import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
            if(set.contains(i*2)){
                return true;
            }
            if(i%2 == 0 && set.contains(i/2)){
                return true;
            }
        }
        return false;
    }
}
