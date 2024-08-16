package leetcode.two_pointers.medium;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        char[] chars = s.toCharArray();
        int countOpening = 0;
        int countUnbalanced = 0;
        for (char aChar : chars) {
            if (aChar == '[') {
                countOpening++;
            } else {
                if (countOpening == 0) {
                    countUnbalanced++;
                } else {
                    countOpening--;
                }
            }
        }
        return (countUnbalanced/2) + (countUnbalanced%2);
    }
}
