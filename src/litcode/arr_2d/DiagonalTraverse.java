package litcode.arr_2d;


import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] arr = new int[10000][10000];
        int count = 1000000;

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                arr[i][j] = count--;
            }
        }
        findDiagonalOrder(arr);

    }

    public static int[] findDiagonalOrder(int[][] mat) {
        int bottom = mat.length;

        int right = mat[0].length;

        List<Integer>[] temp = new ArrayList[bottom + right - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new ArrayList<>();
        }
        for (int i = 0; i < bottom; i++) {
            for (int j = 0; j < right; j++) {
                temp[i + j].add(mat[i][j]);
            }
        }

        int[] res = new int[bottom * right];
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i % 2 == 0) {
                for (int j = temp[i].size() - 1; j >= 0; j--) {
                    res[index++] = temp[i].get(j);
                }
            } else {
                for (int j = 0; j < temp[i].size(); j++) {
                    res[index++] = temp[i].get(j);
                }
            }
        }

        return res;
    }
}