package litcode.binary_search;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (letters[m] <= target && target < letters[m + 1]) {
                return letters[m + 1];
            } else if (letters[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return letters[0];
    }
}
