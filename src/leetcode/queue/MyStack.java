package leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        int n=q.size();
        for(int i=0;i<n-1;i++){
            q.add(q.peek());
            q.poll();
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.size() == 0;
    }
}
