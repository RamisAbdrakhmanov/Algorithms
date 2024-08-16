package leetcode.interview.questions.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        setZeroes(new int[][]{{1, 0, 3, 4}, {5, 6, 0, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
    }
    public static void setZeroes(int[][] matrix) {

        Set<Integer> length = new HashSet<>();
        Set<Integer> width = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {

                    length.add(i);
                    width.add(j);

                }
            }
        }
        for (Integer i : length) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }

        for (Integer j : width) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
