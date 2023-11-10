package litcode.stack;

import java.util.Stack;

public class DecodeString {
  /* public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.add(c);
            } else if (c == ']') {
                if (str.length() == 0) {
                    while (stack.peek() != '[') {
                        str.append(stack.pop());
                    }
                    stack.pop();
                }
            }
        }
    }

    public StringBuilder sb(StringBuilder sd, char[] chars, int start) {
        int i = start;
        while (i < chars.length) {
            if (chars[i] == '[') {
                sb(sd, chars, i + 1);
            }
        }


    }*/

}
