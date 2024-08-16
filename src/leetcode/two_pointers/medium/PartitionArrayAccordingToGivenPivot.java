package leetcode.two_pointers.medium;

public class PartitionArrayAccordingToGivenPivot {

    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0;
        int m = 0;
        for (int num : nums) {
            if (num == pivot) {
                count++;
            }
            if (num < pivot) {
                m++;
            }
        }
        int[] arr = new int[nums.length];
        int l = 0;
        int p = m;
        int r = count + m;

        for (int num : nums) {
            if (num < pivot) {
                arr[l++] = num;
            } else if (num == pivot) {
                arr[p++] = num;
            } else {
                arr[r++] = num;
            }
        }

        System.arraycopy(arr, 0, nums, 0, arr.length);

        return nums;
    }
}
