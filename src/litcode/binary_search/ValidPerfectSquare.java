package litcode.binary_search;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num / 2 + 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (num / m == m) {
                return m * m == num;
            } else if (num / m < m) {
                r = m - 1;
            } else {
                l = m + 1;
            }

        }
        return false;
    }
}
