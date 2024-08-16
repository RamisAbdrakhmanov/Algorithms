package leetcode.two_pointers.medium;

public class AddingSpacesToString {
    public String addSpaces(String s, int[] spaces) {
        int prev = 0;

        StringBuilder stringBuilder = new StringBuilder(s.length() + spaces.length);

        for (int space : spaces) {
            stringBuilder.append(s, prev, space).append(" ");
            prev = space;
        }
        stringBuilder.append(s, prev, s.length());

        return stringBuilder.toString();
    }
}
