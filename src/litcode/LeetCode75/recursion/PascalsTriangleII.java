package litcode.LeetCode75.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    List<Integer> list = new ArrayList<>();

    public List<Integer> getRow(int rowIndex) {
        list.add(1);
        addToList(rowIndex,1,1);
        return list;
    }

    public void addToList(int rowIndex, int idxEl, long prev) {
        if(rowIndex < idxEl){
            return;
        }
        long el = prev * (rowIndex - idxEl + 1) / idxEl;
        list.add((int) el);
        addToList(rowIndex,idxEl+1,el);
    }
}
