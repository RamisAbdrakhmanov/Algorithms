package leetcode.binary_search;

public class SearchADMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 1));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int rows = matrix.length;
        int rowLength = matrix[0].length;
        int r = rows * rowLength - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int my = mid / rowLength;
            int mx = mid % rowLength;

            if (matrix[my][mx] == target) {
                return true;
            } else if (matrix[my][mx] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return false;
    }
}
