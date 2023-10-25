package litcode.LeetCode75.arr_2d;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(2));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        if (numRows < 2) {
            return list;
        }
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        list.add(second);
        for (int i = 2; i < numRows; i++) {
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for (int j = 1; j < i; j++) {
                next.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            next.add(1);
            list.add(next);
        }

        return list;
    }
}
