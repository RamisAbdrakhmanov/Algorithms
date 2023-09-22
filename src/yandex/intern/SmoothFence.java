package yandex.intern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SmoothFence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] a = br.readLine().split(" ");
        int excess = Integer.parseInt(a[1]);

        String[] b = br.readLine().split(" ");
        long[] boards = new long[b.length];

        for (int i = 0; i < boards.length; i++) {
            boards[i] = Integer.parseInt(b[i]);
        }

        System.out.println(getMin(boards, excess));

    }

    public static long getMin(long[] boards, int excess) {
        if (boards.length < 2 || excess >= boards.length) {
            return 0;
        }
        if (boards.length == 2) {
            return boards[1] - boards[0];
        }
        Arrays.sort(boards);
        int left = excess - 1;
        int right = boards.length - excess;
        long min = 0;

        while (excess > 0) {
            excess--;
            if (boards[right] - boards[left + 1] < boards[right - 1] - boards[left]) {
                min = boards[right] - boards[left + 1];

                while (boards[left] == boards[left - 1] && excess > 0) {
                    excess--;
                    left--;
                    if (left == 0) {
                        break;
                    }
                }

                left--;
            } else {
                min = boards[right - 1] - boards[left];

                while (boards[right] == boards[right + 1] && excess > 0) {
                    excess--;
                    right++;
                    if (right == boards.length - 1) {
                        break;
                    }
                }

                right++;
            }
        }

        return min;
    }
}
