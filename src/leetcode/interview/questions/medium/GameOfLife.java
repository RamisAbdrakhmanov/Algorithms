package leetcode.interview.questions.medium;

public class GameOfLife {
    public static void main(String[] args) {
        gameOfLife(new int[][]{{1, 1}, {1, 0}});
    }

    public static void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int count = 0;
                for (int k = Math.max(0, i - 1); k < Math.min(i + 2, board.length); k++) {
                    for (int l = Math.max(0, j - 1); l < Math.min(j + 2, board[0].length); l++) {
                        if (!(k == i && l == j) && (board[k][l] == 1 || board[k][l] == -2)) {
                            count++;
                        }
                    }
                }
                if (board[i][j] == 1) {
                    if (count < 2 || count > 3) {
                        board[i][j] = -2;
                    }
                } else {
                    if (count == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == -2) {
                    board[i][j] = 0;
                }
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }
}
