package litcode.two_pointers.easy;

public class FlippingAnImage {
    public static void main(String[] args) {
        flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (image[i][n - 1 - j] == 0) {
                    temp[j] = 1;
                } else {
                    temp[j] = 0;
                }
            }
            image[i] = temp;
            temp = new int[n];
        }
        return image;
    }
}
