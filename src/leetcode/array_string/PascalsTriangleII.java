package leetcode.array_string;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public List<Integer> getRow(int line) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        long prev = 1;
        for (int i = 1; i <= line; i++) {
            long next = prev * (line - i + 1) / i;
            list.add((int) next);
            prev = next;
        }
        return list;
    }

}
