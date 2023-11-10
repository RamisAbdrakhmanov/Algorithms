package litcode.LeetCode75.array_string;

public class CountNumberOfHomogenousSubstrings {
    public int countHomogenous(String s) {
        char[] chars = s.toCharArray();
        long ans = 0;
        for (int left = 0; left < chars.length; left++) {
            char current = chars[left];
            ans++;
            int right = left + 1;
            while (right < chars.length && chars[right] == current) {
                ans += right - left + 1;
                right++;
            }

            left = right - 1;
        }

        return (int) (ans % (Math.pow(10,9)+7));
    }
    public static int sou(){
        return new CountNumberOfHomogenousSubstrings().countHomogenous(String.valueOf(123));
    }
}
