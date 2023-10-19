package litcode.LeetCode75.Stack;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2= new Stack<>();
        for (char c : s.toCharArray()){
            if(c == '#'){
                if(!stack1.isEmpty()) {
                    stack1.pop();
                }
            }else {
                stack1.push(c);
            }
        }
        for (char c : t.toCharArray()){
            if(c == '#'){
                if(!stack2.isEmpty()) {
                    stack2.pop();
                }
            }else {
                stack2.push(c);
            }
        }

        return stack1.equals(stack2);
    }
}
