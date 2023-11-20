package litcode.array_string;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ReductionOperationsToMakeTheArrayElementsEqual {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int sum = 0;
        for(int i = nums.length-1; i > 0; i--){
            count++;
            if(nums[i] != nums[i-1]){
                sum += count;
            }
        }
        return sum;
    }
}
