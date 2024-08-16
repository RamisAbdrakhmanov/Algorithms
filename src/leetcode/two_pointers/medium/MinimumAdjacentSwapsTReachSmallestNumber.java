package leetcode.two_pointers.medium;

import java.util.LinkedList;

public class MinimumAdjacentSwapsTReachSmallestNumber {
    public static void main(String[] args) {
        System.out.println(getMinSwaps("99499", 5)); //0085 0508 0580 0805 0850
    }

    public static int getMinSwaps(String num, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = num.length() - 1; i >= 0; i--) {
            list.add((num.charAt(i) - '0'));
        }
        list.add(0);

        int count = 0;

        while (k-- != 0) {
            int max = list.get(0);
            int r = 0;
            for (int i = 1; i < list.size(); i++) {
                if (max > list.get(i)) {
                    r = i;
                    break;
                }

                max = Math.max(max, list.get(i));
            }


            int pozForSwap = -1;
            int mathDifference = Integer.MAX_VALUE;

            for (int i = 0; i < r; i++) {
                if (list.get(i) - list.get(r) > 0 && list.get(i) - list.get(r) < mathDifference) {
                    mathDifference = list.get(i) - list.get(r);
                    pozForSwap = i;
                }
            }

            if (pozForSwap + 1 == r) {
                count++;
            }

            int save = list.get(pozForSwap);
            list.remove(pozForSwap);
            list.add(r, save);

            System.out.println(list);
        }

        return count;
    }
}
