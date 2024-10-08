package leetcode.interview.questions.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(new FindTheIndexOfTheFirstOccurrenceInAString().mySqrt(777));
    }
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int lo = 2, hi = x / 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long sq = (long) mid * mid;
            if (sq > x)
                hi = mid - 1;
            else if (sq < x)
                lo = mid + 1;
            else
                return mid;
        }
        return hi;
    }
}
