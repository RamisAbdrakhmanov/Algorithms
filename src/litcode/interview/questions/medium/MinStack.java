/*
package litcode.interview.questions.medium;

class MinStack {
    int val;
    MinStack previous;
    MinStack next;

    public MinStack() {

    }

    private MinStack(int val, MinStack previous){
        this.val = val;
        this.previous = previous;
    }


    public void push(int val) {
        MinStack stack = new MinStack(val,this);
        this = stack;
    }

    public void pop() {
        this = this.previous;
    }

    public int top() {

    }

    public int getMin() {

    }
}

*/
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
