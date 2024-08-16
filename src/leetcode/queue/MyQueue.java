package leetcode.queue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> stackCopy;

    public MyQueue() {
        stack = new Stack<>();
        stackCopy = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        while (!stack.isEmpty()){
            stackCopy.push(stack.pop());
        }
        int pop = stackCopy.pop();
        while (!stackCopy.isEmpty()){
            stack.push(stackCopy.pop());
        }
        return pop;
    }

    public int peek() {
        while (!stack.isEmpty()){
            stackCopy.push(stack.pop());
        }
        int first = stackCopy.peek();
        while (!stackCopy.isEmpty()){
            stack.push(stackCopy.pop());
        }
        return first;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}