package repetable;/*
package litcode.LeetCode75.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K_thSymbolInGrammar {
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new K_thSymbolInGrammar().kthGrammar(10, 10));
    }

    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        if (k % 2 == 0) {
            return kthGrammar(n-1,k/2) == 0 ? 1 : 0;
        } else {
            return kthGrammar(n-1,(k+1)/2) == 0 ? 1 : 0;
        }
    }

    public void rec(int row, int numb) {
        if (row == 1) {
            return;
        }
        int k = list.size();
        for (int i = k / 2; i < k; i++) {
            if (list.get(i) == 0) {
                list.add(0);
                list.add(1);
            } else {
                list.add(1);
                list.add(0);
            }
        }
        System.out.println(list);
        rec(row - 1);
    }
}
*/
