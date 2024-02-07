package litcode.two_pointers.medium;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();

        char[] p = pattern.toCharArray();

        for (String str : queries) {
            char[] s = str.toCharArray();

            boolean isOk = isPattern(p, s);

            ans.add(isOk);
        }


        return ans;
    }

    private boolean isPattern(char[] p, char[] s) {

        int iterator = 0;

        for (int i = 0; i < s.length; i++) {
            if (iterator < p.length) {
                if (p[iterator] == s[i]) {
                    iterator++;
                } else if (s[i] < 92) {
                    return false;
                }
            } else {
                if (s[i] < 92) {
                    return false;
                }
            }

        }

        return iterator == p.length;
    }


}
