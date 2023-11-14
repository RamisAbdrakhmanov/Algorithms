package litcode.binary_search;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0)
            return x;

        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid > x/mid) {
                right = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
