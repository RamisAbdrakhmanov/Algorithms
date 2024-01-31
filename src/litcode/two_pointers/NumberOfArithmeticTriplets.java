/*
package litcode.two_pointers;

public class NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int left = 0;
        int right =  1;

        int count = 0;
        while (left != nums.length && right != nums.length){
            if(left == right){
                right++;
                continue;
            }
            if(nums[right] - nums[left] < diff){
                right++;
            } else if(nums[right] - nums[left] > diff){
                left++;
            } else {
                right++;
                count++;
            }
        }

        return count;
    }
}
*/
