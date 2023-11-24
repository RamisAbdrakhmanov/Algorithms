/*

ПОЧЕМУ ЭТО ТАК РАБОТАЕТ

*//*


package litcode.LeetCode75.sliding_window;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        System.out.println(new MaxConsecutiveOnesIII().longestOnes(new int[]{1, 0, 0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1}, 2));
    }

    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r;
        for (r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                k--;
            }

            if (k < 0 && nums[l++] == 0) {
                k++;
            }
        }
        return r - l;
    }
}
*/
