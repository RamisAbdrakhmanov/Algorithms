package litcode.binary_search;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        int min = Integer.MAX_VALUE;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < min) {
                min = nums[m];
            }

            if (nums[l] < nums[r]) {
                r = m - 1;
            } else {
                if (nums[m] < nums[r]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return min;
    }
}
