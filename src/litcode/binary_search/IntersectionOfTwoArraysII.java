package litcode.binary_search;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count = 0;
        int[] mark = new int[1001];
        Arrays.sort(nums2);

        for (int j : nums1) {
            if (! binarySearch(nums2, j)) {
                count++;
                mark[j] ++;
            }
        }

        int[] ans = new int[count];
        for (int i = 0; i < mark.length; i++) {
            for (int j = 0; j < mark[i]; j++) {
                ans[--count] = i;
            }
        }
        return ans;
    }


    private boolean binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) {
                return true;
            }

            if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}
