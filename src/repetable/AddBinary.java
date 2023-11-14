/*
package litcode.array_string;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder srt = new StringBuilder();
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int carry = 0;
        while (l1 >= 0 || l2 >= 0) {
            int sum = carry;
            if (l1 >= 0) {
                sum += a.charAt(l1--) - '0';
            }
            if (l2 >= 0) {
                sum += b.charAt(l2--) - '0';
            }
            carry = sum > 1 ? 1 : 0;
            srt.append(sum % 2);
        }
        if (carry != 0) {
            srt.append(carry);
        }
        return srt.reverse().toString();
    }
}
*/
