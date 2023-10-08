package litcode.LeetCode75.array_string;


public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'b'}));
    }

    public static int compress(char[] chars) {
        if (chars == null) {
            return 0;
        }

        int left = 0;
        int right = 1;

        int count = 0;
        int i = 1;

        while (right < chars.length) {
            if (chars[right] == chars[left]) {
                right++;
                i++;
            } else {
                chars[count++] = chars[left];

                if (i > 1) {
                    char[] c = String.valueOf(i).toCharArray();
                    for (char value : c) {
                        chars[count++] = value;
                    }
                }

                left = right++;
                i = 1;
            }
        }
        chars[count++] = chars[left];

        if (i > 1) {
            char[] c = String.valueOf(i).toCharArray();
            for (char value : c) {
                chars[count++] = value;
            }
        }

        return count;
    }
}
