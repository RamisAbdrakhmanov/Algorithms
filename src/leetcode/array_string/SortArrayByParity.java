package leetcode.array_string;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int l = nums[left];
            int r = nums[right];
            if(l%2 == 1 && r%2 == 0){
                nums[left] = r;
                nums[right] = l;
                right--;
                left++;
            }else {
                if(l%2 == 0){
                    left++;
                }
                if(r%2 == 1){
                    right--;
                }
            }
        }
        return nums;
    }
}
