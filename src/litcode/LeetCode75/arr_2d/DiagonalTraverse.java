/*
package litcode.LeetCode75.arr_2d;


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

    */
/*public static int[] findDiagonalOrder(int[][] mat) {
        int wight = mat[0].length;
        int length = mat.length;

        int[] ans = new int[wight * length];
        int poz = 0;

        boolean isTop = false;
        for (int i = 0; i < length + wight - 1; i++) {
            for (int j = 0; j < length + wight - 1; j++) {
                if (isTop) {
                    if (j >= length || i - j < 0 || i - j >= wight) {
                        continue;
                    }
                    ans[poz++] = mat[j][i - j];
                } else {
                    if (j >= wight || i - j < 0 || i - j >= length) {
                        continue;
                    }
                    ans[poz++] = mat[i - j][j];
                }
            }
            isTop = !isTop;
        }


        return ans;
    }*//*


    public static int[] findDiagonalOrder(int[][] mat) {
        return null;
    }
}
*/
