package leetcode.string.easy;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {


        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();

        int count = 0;

        for (char c : chars) {
            if (c == '-') {
                count++;
            }
        }

        if (count == s.length()) {
            return "";
        }

        int first = (chars.length - count) % k;

        int start = 0;

        if (first != 0) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != '-') {
                    sb.append(Character.toUpperCase(chars[i]));
                }

                if (sb.length() == first) {
                    start = i + 1;
                    sb.append('-');
                    break;
                }
            }
        }


        count = 0;
        for (int i = start; i < chars.length; i++) {
            if (count == k) {
                count = 0;
                sb.append('-');
            }

            if (chars[i] != '-') {
                sb.append(Character.toUpperCase(chars[i]));
                count++;
            }

        }

        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
