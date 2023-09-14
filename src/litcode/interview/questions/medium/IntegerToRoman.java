package litcode.interview.questions.medium;

import java.util.ArrayList;
import java.util.List;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(8));
    }
    public static String intToRoman(int num) {
        int length = String.valueOf(num).length();
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("V");
        list.add("X");
        list.add("L");
        list.add("C");
        list.add("D");
        list.add("M");
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= length; i++) {
            int a = num % 10;
            num /= 10;
            if (a < 4) {
                for (int j = 0; j < a; j++) {
                    ans.add(list.get(i * 2));
                }
            } else if (a == 4) {
                ans.add(list.get((i * 2) + 1));
                ans.add(list.get(i * 2));
            } else if (a < 9) {
                ans.add(list.get((i * 2) + 1));
                a -= 5;
                for (int j = 0; j < a; j++) {
                    ans.add(list.get(i * 2));
                }
            } else {
                ans.add(list.get((i + 1) * 2));
                ans.add(list.get(i * 2));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = ans.size() - 1; i >= 0; i--) {
            stringBuilder.append(ans.get(i));
        }
        return String.valueOf(stringBuilder);
    }
}
