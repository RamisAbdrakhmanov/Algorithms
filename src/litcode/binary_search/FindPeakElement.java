package litcode.binary_search;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int l = 1;
        int r = nums.length - 2;

        if (nums[l - 1] > nums[l]) {
            return 0;
        }

        if (nums[r + 1] > nums[r]) {
            return r + 1;
        }
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m - 1] < nums[m] && nums[m] > nums[m + 1]) {
                return m;
            }

            if (nums[m - 1] < nums[m]) {
                l = m;
            } else {
                r = m;
            }

        }
        return -1;
    }
}
