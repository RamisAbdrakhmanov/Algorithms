package leetcode.binary_search;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int numb : arr1) {
            if (hasDistanceMoreTwo(arr2, numb, d)) {
                count++;
            }
        }

        return count;
    }

    private boolean hasDistanceMoreTwo(int[] arr, int numb, int d) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (numb >= arr[m] - d && numb <= arr[m] + d) {
                return false;
            }
            if (numb < arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return true;
    }
}
