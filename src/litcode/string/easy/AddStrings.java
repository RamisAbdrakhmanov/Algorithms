package litcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int n = Math.min(num1.length(), num2.length());

        StringBuilder sb = new StringBuilder();

        int member = 0;
        for (int i = 0; i < n; i++) {
            int sum = (num1.charAt(num1.length() - 1 - i) - '0') + (num2.charAt(num2.length() - 1 - i) - '0');

            if (member > 0) {
                sum += member--;
            }

            if (sum > 9) {
                member++;
                sum -= 10;
            }
            sb.append((char) (sum + '0'));
        }

        for (int i = n; i < num1.length(); i++) {
            int sum = num1.charAt(num1.length() - 1 - i) - '0';
            if (member > 0) {
                sum += member--;
            }
            if (sum > 9) {
                member++;
                sum -= 10;
            }
            sb.append((char) (sum + '0'));
        }
        for (int i = n; i < num2.length(); i++) {
            int sum = num2.charAt(num2.length() - 1 - i) - '0';

            if(member>0){
                sum+=member--;
            }

            if (sum > 9) {
                member++;
                sum -= 10;
            }
            sb.append((char) (sum + '0'));
        }
        if (member == 1) {
            sb.append((char) (member + '0'));
        }

        sb.reverse();

        return sb.toString();

    }
}
