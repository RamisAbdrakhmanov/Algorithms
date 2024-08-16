package leetcode.stack;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        System.out.println(new RemoveOutermostParentheses().removeOuterParentheses("(()()()(()()))"));
    }
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Boolean> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                if(stack.size() > 0){
                    sb.append(s.charAt(i));
                }
                stack.push(true);
            } else {
                stack.pop();
                if(stack.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }

}
