package leetcode.interview.questions.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int next = n;
        while (next != 1) {
            next = getNext(next);
            if (set.contains(next)) {
                return false;
            } else {
                set.add(next);
            }
        }
        return true;

    }

    public int getNext(int numb) {
        int sum = 0;
        while (numb > 0) {
            int i = numb % 10;
            sum += i * i;
            numb /= 10;
        }
        return sum;
    }
}
