package litcode.stack;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                case "+" -> {
                    int temp = stack.pop();
                    int sum = stack.peek() + temp;
                    stack.push(temp);
                    stack.push(sum);
                    break;
                }
                default -> stack.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
