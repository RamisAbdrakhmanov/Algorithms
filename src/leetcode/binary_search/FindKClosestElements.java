package leetcode.binary_search;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {

    public static void main(String[] args) {
        System.out.println(new FindKClosestElements().findClosestElements(new int[]{1, 3}, 1, 2));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int l = 0;
        int r = arr.length - k - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (x - arr[m] > arr[m + k] - x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = l; i < l + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
