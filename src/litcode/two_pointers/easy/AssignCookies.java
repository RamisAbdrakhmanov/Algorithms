package litcode.two_pointers.easy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int iteratorCookies = 0;
        for (int j : g) {
            while (iteratorCookies < s.length) {
                if (s[iteratorCookies++] >= j) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
