package litcode.stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (sb.length() > 0 && Math.abs(c - sb.charAt(sb.length() - 1)) == 32) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
