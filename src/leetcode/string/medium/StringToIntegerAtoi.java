package leetcode.string.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("words and 987"));
    }
    public static int myAtoi(String s) {
        int minus = s.indexOf("-");
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        matcher.find();


        int firstA = -1;

        for (int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                firstA = i;
            }
        }
        int start = matcher.start();
        String sub = matcher.group();


        long ans = Long.parseLong(sub);
        if(firstA < start && firstA != -1){
            ans = 0;
        }

        if(minus < start && minus != -1){
            ans = -ans;
        }
        if(ans > Integer.MAX_VALUE){
            ans = Integer.MAX_VALUE;
        }else if (ans < Integer.MIN_VALUE){
            ans = Integer.MIN_VALUE;
        }

        return (int) ans;

    }
}
