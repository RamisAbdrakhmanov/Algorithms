package litcode.two_pointers.medium;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class TheKStrongestValuesInAnArray {
    public int[] getStrongest(int[] arr, int k) {
        int[] ans = new int[k];
        int n = arr.length;

        Arrays.sort(arr);

        int m = arr[(n - 1) / 2];
        int l = 0;
        int r = arr.length - 1;

        for (int i = 0; i < ans.length; i++) {
            if (Math.abs(arr[l] - m) > Math.abs(arr[r] - m)) {
                ans[i] = arr[l];
                l++;
            } else {
                ans[i] = arr[r];
                r--;
            }
        }

        return ans;
    }


}
