package litcode.daily;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> maxPoz = new ArrayDeque<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!maxPoz.isEmpty() && temperatures[maxPoz.peek()] <= temperatures[i]){
                maxPoz.pop();
            }
            if(!maxPoz.isEmpty()){
                ans[i] = maxPoz.peek()- i;
            }
            maxPoz.push(i);
        }
        return ans;
    }
}
