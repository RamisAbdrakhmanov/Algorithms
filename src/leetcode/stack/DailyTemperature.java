package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> poz = new Stack<>();
        for (int i = temperatures.length-1; i >= 0 ; i--) {
            while (!poz.isEmpty() && temperatures[poz.peek()] <= temperatures[i] ){
                poz.pop();
            }
            if(!poz.isEmpty()){
                ans[i] = poz.peek()-i;
            }

            poz.push(i);
        }
        return ans;
    }
}
