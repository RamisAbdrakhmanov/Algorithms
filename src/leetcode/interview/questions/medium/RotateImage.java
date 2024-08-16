package leetcode.interview.questions.medium;

public class RotateImage {
    public static void main(String[] args) {
        rotate(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
    }


    public static void rotate(int[][] matrix) {
        int c = 0;
        while (c < matrix.length / 2) {

            int poz = matrix.length - 1 - c;

            for (int i = c; i <= matrix.length - 2 - c; i++) {

                int temp1 = matrix[i][poz];
                int temp2 = matrix[poz][matrix.length - 1 - i];
                int temp3 = matrix[matrix.length - 1 - i][c];

                matrix[i][poz] = matrix[c][i];
                matrix[poz][matrix.length - 1 - i] = temp1;
                matrix[matrix.length - 1 - i][c] = temp2;
                matrix[c][i] = temp3;
            }

            c++;
        }
    }

}
