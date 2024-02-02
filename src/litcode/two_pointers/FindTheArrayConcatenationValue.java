package litcode.two_pointers;

public class FindTheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        long ans = 0;

        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            if (left == right) {
                ans += nums[left];
            } else {
                String s = String.valueOf(nums[left]) +
                        nums[right];
                ans += Integer.parseInt(s);
            }
            left++;
            right--;
        }

        return ans;
    }
}
