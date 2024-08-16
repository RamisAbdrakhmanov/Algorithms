package leetcode.interview.questions.medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "*" -> {
                    int last = stack.pop();
                    int penultimate = stack.pop();
                    stack.push(penultimate * last);
                }
                case "/" -> {
                    int last = stack.pop();
                    int penultimate = stack.pop();
                    stack.push(penultimate / last);
                }
                case "-" -> {
                    int last = stack.pop();
                    int penultimate = stack.pop();
                    stack.push(penultimate - last);
                }
                case "+" -> {
                    int last = stack.pop();
                    int penultimate = stack.pop();
                    stack.push(penultimate + last);
                }
                default -> stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
