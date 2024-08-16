package leetcode.LeetCode75.prefix_sum;

public class FindPivotIndex {
    public static void main(String[] args) {
        pivotIndex(new int[]{1,7,3,6,5,6});
    }
    public  static int pivotIndex(int[] nums) {
        int[] arr1 = new int[nums.length+1];
        int[] arr2 = new int[nums.length+1];

        for(int i = 0 ; i < nums.length;i++){
            arr1[i+1] = arr1[i]+nums[i];
            arr2[nums.length-1-i] = arr2[nums.length-i]+nums[nums.length-1-i];
        }

        for(int i = 0; i < nums.length; i++){
            if(arr1[i]==arr2[i+1]){
                return i;
            }
        }
        return -1;
    }
}
