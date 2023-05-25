package litcode.interview.questions.easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("([)]"));
    }
    /*public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[3];
        for (char aChar : chars) {
            switch (aChar) {
                case '{':
                    arr[0]++;
                    break;
                case '}':
                    if (arr[0] == 0) {
                        return false;
                    } else {
                        arr[0]--;
                    }
                    break;
                case '[':
                    arr[1]++;
                    break;
                case ']':
                    if (arr[1] == 0) {
                        return false;
                    } else {
                        arr[1]--;
                    }
                    break;
                case '(':
                    arr[2]++;
                    break;
                case ')':
                    if (arr[2] == 0) {
                        return false;
                    } else {
                        arr[2]--;
                    }
                    break;
            }
        }
        return arr[0] == 0 && arr[1] == 0 && arr[2] == 0;
    }*/

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        if (chars.length % 2 == 1) {
            return false;
        }
        for (char c : chars){
            switch (c) {
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case '(' -> stack.push(')');
                default -> {
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
