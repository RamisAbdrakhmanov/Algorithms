package leetcode.LeetCode75.sliding_window;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        longestSubarray(new int[]{1,1,0,1});
    }
    public static int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int[] sum = new int[2];
        sum[1] = -1;
        int max = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                sum[0]= sum[1];
                sum[1]=right-left;
                left = right+1;
            }
            if(sum[0]+sum[1] > max){
                max = sum[0]+sum[1];
            }
            right++;
        }
        sum[0]= sum[1];
        sum[1]=right-left;
        if(sum[0]+sum[1] > max){
            max = sum[0]+sum[1];
        }

        return max;
    }
}
