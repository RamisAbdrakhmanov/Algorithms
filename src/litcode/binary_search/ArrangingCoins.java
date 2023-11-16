package litcode.binary_search;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(9));
    }

    public static int arrangeCoins(int n) {
        int l = 0;
        int r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m == n) {
                return m;
            } else if (m > n) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
