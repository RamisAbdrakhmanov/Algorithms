package litcode.interview.questions.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i+1 < nums.length && (nums[i] + 1 == nums[i+1])) {
                i++;
            }
            if(start != nums[i]){
                list.add(String.format("%d -> %d",start,nums[i]));
            }else {
                list.add(String.valueOf(nums[i]));
            }
        }
        return list;
    }
}
