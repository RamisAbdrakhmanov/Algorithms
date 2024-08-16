package leetcode.binary_search;

public class MaximumCountPositiveInteger_2529 {
    public static void main(String[] args) {
        System.out.println(maximumCount(new int[] {-3,-2,-1,0,0,1,2}));
    }


    public static int maximumCount(int[] nums) {
        return Math.max(nums.length - getFirstPositive(nums), getLastNegative(nums)+1);
    }

    private static int getFirstPositive(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > 0 && (mid == 0 || arr[mid - 1] <= 0)) {
                return mid;
            } else if (arr[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr.length;
    }

    private static int getLastNegative(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < 0 && (mid == arr.length-1 || arr[mid + 1] >= 0)) {
                return mid;
            } else if (arr[mid] >= 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
