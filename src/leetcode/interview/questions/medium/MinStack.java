package leetcode.interview.questions.medium;

import java.util.*;

class MinStack {
    Stack<Integer> stack;
    PriorityQueue<Integer> priority = new PriorityQueue<>(Comparator.comparingInt(value -> value));

    public MinStack() {
        stack = new Stack<>();
    }


    public void push(int val) {
        stack.push(val);
        priority.add(val);
    }

    public void pop() {
        priority.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(!priority.isEmpty()) {
            return priority.peek();
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
