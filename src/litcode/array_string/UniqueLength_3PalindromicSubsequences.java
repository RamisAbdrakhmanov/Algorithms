package litcode.array_string;

public class UniqueLength_3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if( first != last ) {
                String sub = s.substring(first + 1, last);
                for (char k = 'a'; k <= 'z'; k++) {
                    if (sub.indexOf(k) != -1) {
                        sum++;
                    }
                }
            }

        }
        System.gc();
        return sum;
    }
}
