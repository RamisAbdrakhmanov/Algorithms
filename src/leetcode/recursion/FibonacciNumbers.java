package leetcode.recursion;

public class FibonacciNumbers {
    public int fib(int n) {
        if(n < 2 ){
            return n;
        }
        return fib1(0,1,n-2);
    }

    public int fib1(int prev1, int prev2, int n) {
        if(n == 0){
            return prev1 + prev2;
        }
        return fib1(prev2, prev1+prev2,n-1);
    }
}
