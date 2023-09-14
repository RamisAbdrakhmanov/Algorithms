package litcode.interview.questions.medium;

import java.util.Objects;

public class ReverseWordInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        String[] str = s.trim().split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length - 1; i > 0; i--) {
            if (!str[i].equals("")) {
                stringBuilder.append(str[i]).append(" ");
            }
        }
        stringBuilder.append(str[0]);
        return String.valueOf(stringBuilder);
    }
}