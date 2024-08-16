package leetcode.string.medium;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (s == null || numRows <= 0) {
            throw new IllegalArgumentException("Input is invalid");
        }

        int len = s.length();
        if (numRows == 1 || len <= numRows) {
            return s;
        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        int c = 2*(numRows-1);
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < chars.length; j+= c) {
                sb.append(chars[j]);
                if(i != 0 && i != numRows-1 && j+ c - (2*i) < chars.length ){
                    sb.append(chars[j+ c - (2*i)]);
                }
            }

        }

        return sb.toString();
    }

}
