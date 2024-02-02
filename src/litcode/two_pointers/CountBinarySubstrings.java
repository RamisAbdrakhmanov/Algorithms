package litcode.two_pointers;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        countBinarySubstrings("00110011");
    }
    public static int countBinarySubstrings(String s) {
        int count = 0;
        int prevRepeat= 0;
        int repeat = 0;

        char[] chars = s.toCharArray();
        char current = chars[0];

        for (char aChar : chars) {
            if (aChar != current) {
                current = aChar;
                count += Math.min(repeat, prevRepeat);
                prevRepeat = repeat;
                repeat = 0;
            }
            repeat++;
        }

        count += Math.min(repeat, prevRepeat);

        return count;
    }
}
