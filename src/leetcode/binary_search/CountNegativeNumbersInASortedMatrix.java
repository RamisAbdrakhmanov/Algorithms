package leetcode.binary_search;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        System.out.println(new CountNegativeNumbersInASortedMatrix()
                .countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
    public int countNegatives(int[][] grid) {
        int left = 0;
        int right = grid[0].length - 1;

        int sum = 0;

        for (int[] ints : grid) {
            right = getFirstNegative(ints, left, right);
            sum += grid[0].length - (right + 1);
        }

        System.gc();
        return sum;
    }

    private int getFirstNegative(int[] row, int left, int right) {
        if (row[0] < 0) {
            return -1;
        }
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (row[mid] >= 0) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
