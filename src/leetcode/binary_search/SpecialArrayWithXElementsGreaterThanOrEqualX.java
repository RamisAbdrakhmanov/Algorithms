package leetcode.binary_search;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    public int specialArray(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int count = 0;
            for(int num : nums){
                if(num>=mid){
                    count++;
                }
            }
            if (count == mid) {
                return mid;
            } else if (count > mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.gc();
        return -1;
    }
}
