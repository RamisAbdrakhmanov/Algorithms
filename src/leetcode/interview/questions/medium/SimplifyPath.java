package leetcode.interview.questions.medium;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] str = path.split("/");

        Stack<String> stack = new Stack<>();

        for (String s : str) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!(s.equals(".") || s.equals(""))) {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()) {
            stringBuilder.insert(0, stack.pop()).insert(0, "/");
        }

        return String.valueOf(stringBuilder);
    }
}
