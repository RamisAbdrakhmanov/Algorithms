package litcode.binary_search;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        peakIndexInMountainArray(new int[]{3,4,5,1});
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int l = 1;
        int r = arr.length - 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m - 1] < arr[m] && arr[m] > arr[m + 1]) {
                return m;
            }
            if (arr[m - 1] > arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
