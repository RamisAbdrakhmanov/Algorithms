package litcode.interview.questions.medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];

                if ((r != '.' && !row.add(r)) || (c != '.' && !column.add(c))) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkBlock(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkBlock(char[][] board, int r, int c) {
        Set<Character> block = new HashSet<>();
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                char b = board[i][j];
                if (b != '.' && !block.add(b)) {
                    return false;
                }
            }
        }
        return true;
    }
}
