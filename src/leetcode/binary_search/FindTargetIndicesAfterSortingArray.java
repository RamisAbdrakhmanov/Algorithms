package leetcode.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int start = indexOfFirst(nums, target);

        if (start == -1) {
            return new ArrayList<>();
        }

        while (start < nums.length && nums[start] == target){
            list.add(start++);
        }

        return list;
    }

    private int indexOfFirst(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target && (m == 0 || arr[m - 1] != target)) {
                return m;
            } else if (arr[m] >= target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }


}
