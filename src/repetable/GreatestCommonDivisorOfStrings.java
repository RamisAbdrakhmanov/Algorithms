/*
package litcode.array_string;

public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str2 + str1).equals(str1 + str2)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0,gcd);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
*/
