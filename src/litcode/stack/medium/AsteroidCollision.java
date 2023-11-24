package litcode.stack.medium;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            check(stack, asteroid);
        }
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }

    public void check(Stack<Integer> stack, int target) {
        if (stack.isEmpty()) {
            stack.push(target);
            return;
        }
        int last = stack.peek();
        if (stack.peek() > 0 && target < 0) {
            int temp = stack.pop();
            if (temp > -target) {
                stack.push(temp);
            } else if (temp < -target) {
                check(stack, target);
            }
        } else {
            stack.push(target);
        }
    }
}
