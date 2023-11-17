package litcode.binary_search;

public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int start = indexOfFirst(nums, target);
        int end = indexOfLast(nums, target);


        return new int[]{start, end};
    }

    private int indexOfFirst(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target && (m == 0 || arr[m - 1] < target)) {
                return m;
            }

            if (arr[m] >= target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    private int indexOfLast(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target && (m == arr.length - 1 || arr[m + 1] > target)) {
                return m;
            }

            if (arr[m] <= target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
