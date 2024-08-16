package leetcode.easy;

public class ShuffleTheArray {
    public static void main(String[] args) {
        shuffle(new int[] {1,2,3,4,4,3,2,1}, 4);
    }
    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int iteratorX = 0;
        int iteratorY = nums.length/2;
        for (int i = 0; i < ans.length; i+=2) {
            ans[i] = nums[iteratorX++];
            ans[i+1]= nums[iteratorY++];
        }
        return nums;
    }
}
