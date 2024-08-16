package leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqEmail = new HashSet<>();

        for (String c : emails) {
            StringBuilder sb = new StringBuilder();
            int index = 0;
            char[] s = c.toCharArray();

            while (s[index] != '+' && s[index] != '@') {
                if (s[index] != '.') {
                    sb.append(s[index]);
                }
                index++;
            }

            while (s[index]!='@') {
                index++;
            }

            sb.append('@');

            sb.append(String.valueOf(s[index]).repeat(Math.max(0, s.length - (index + 1))));

            uniqEmail.add(sb.toString());
        }

        return uniqEmail.size();
    }

}
