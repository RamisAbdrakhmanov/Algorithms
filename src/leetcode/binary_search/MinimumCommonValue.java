package leetcode.binary_search;

public class MinimumCommonValue {
    public static void main(String[] args) {
        System.out.println(getCommon( new int[]{5,6,7,8,9,10,100}, new  int[]{1,2,100}));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int iterator1 = 0;
        int iterator2 = 0;
        while (iterator2 < nums2.length && iterator1 < nums1.length) {
            if (nums1[iterator1] < nums2[iterator2]) {
                iterator1++;
            } else if (nums1[iterator1] > nums2[iterator2]) {
                iterator2++;
            } else {
                return nums1[iterator1];
            }
        }
        return -1;
    }

   /* public int getCommon(int[] nums1, int[] nums2) {
        for (int j : nums1) {
            if (hasNum(nums2, j)) {
                return j;
            }
        }
        return -1;
    }

    private boolean hasNum(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) {
                return true;
            } else if (target < arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }*/
}
