package leetcode.array_string;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] nums2 = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--){
            int n1 = nums[left]*nums[left];
            int n2 = nums[right]*nums[right];
            if(n1>n2){
                left++;
                nums2[i]=n1;
            }else{
                right--;
                nums2[i]=n2;
            }
        }
        return nums2;
    }
}
