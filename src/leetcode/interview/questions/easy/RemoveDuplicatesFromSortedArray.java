package leetcode.interview.questions.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int count = 0;
        int unique = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                unique++;
                nums[i - count] = nums[i];
            }
        }
        return unique;
    }
}
