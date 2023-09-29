package litcode.interview.questions.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }


    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    /*public static List<Integer> spiralOrder(int[][] matrix) {
        int width = 0;
        int height = 0;
        List<Integer> list = new ArrayList<>();
        int count = matrix.length * matrix[0].length;

        int i = 0;
        int j = 0;

        boolean isHorizontally = true;
        boolean onTheRight = true;
        boolean onTheDown = true;

        while (count-- != 0) {
            if (isHorizontally && onTheRight) {
                if (j < matrix[0].length - (width / 2) - 1) {
                    list.add(matrix[i][j++]);
                } else {
                    list.add(matrix[i][j]);
                    isHorizontally = false;
                    onTheRight = false;
                    height++;
                    i++;
                }
            } else if (!isHorizontally && onTheDown) {
                if (i < matrix.length - (height / 2) - 1) {
                    list.add(matrix[i++][j]);
                } else {
                    list.add(matrix[i][j]);
                    isHorizontally = true;
                    onTheDown = false;
                    j--;
                    width++;
                }
            } else if (isHorizontally && !onTheRight) {
                if (j > width / 2) {
                    list.add(matrix[i][j--]);
                } else {
                    list.add(matrix[i][j]);
                    isHorizontally = false;
                    onTheRight = true;
                    i--;
                    height++;
                }
            } else {
                if (i > height / 2) {
                    list.add(matrix[i--][j]);
                } else {
                    list.add(matrix[i][j]);
                    isHorizontally = true;
                    onTheDown = true;
                    j++;
                    width++;
                }
            }


        }
        return list;
    }*/
}
