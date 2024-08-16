package leetcode.arr_2d;

import java.util.*;

public class RestoreTheArrayFromAdjacentPairs {
    public int[] restoreArray(int[][] adjacentPairs) {

        HashMap<Integer, LinkedList<int[]>> map = new HashMap<>();
        Set<Integer> firstAndLast = new HashSet<>();
        int[] arr = new int[adjacentPairs.length + 1];
        for (int[] adjacentPair : adjacentPairs) {
            for (int i : adjacentPair) {
                if (firstAndLast.contains(i)) {
                    firstAndLast.remove(i);
                } else {
                    firstAndLast.add(i);
                }

                if (map.containsKey(i)) {
                    map.get(i).add(adjacentPair);
                } else {
                    LinkedList<int[]> list = new LinkedList<>();
                    list.add(adjacentPair);
                    map.put(i, list);
                }
            }
        }
        for (int i : firstAndLast) {
            arr[0] = i;
        }

        for (int i = 1; i < arr.length; i++) {

            LinkedList<int[]> list = map.get(arr[i - 1]);

            for (int k : list.getFirst()) {
                if (k != arr[i - 1]) {
                    arr[i] = k;
                    LinkedList<int[]> listK = map.get(arr[i]);
                    for (int[] currency : listK) {
                        for (int j : currency) {
                            if (j == arr[i - 1]) {
                                listK.remove(currency);
                            }
                        }
                    }
                }
            }
        }

        return arr;
    }
}
