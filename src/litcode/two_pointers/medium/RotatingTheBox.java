package litcode.two_pointers.medium;

public class RotatingTheBox {
    public static char[][] rotateTheBox(char[][] box) {

        char[][] rotatedBox = new char[box[0].length][box.length];

        for (int i = 0; i < box.length; i++) {

            int column = rotatedBox[0].length - 1 - i;
            int count = 0;


            for (int j = 0; j < box[0].length; j++) {


                if (box[i][j] == '#') {
                    count++;
                }

                if (box[i][j] == '*') {
                    rotatedBox[j][i] = '*';
                    int start = j - 1;
                    while (start >= 0 && rotatedBox[start][column] != '*') {
                        if (count > 0) {
                            rotatedBox[start--][column] = '#';
                            count--;
                        } else {
                            rotatedBox[start--][column] = '.';
                        }
                    }
                }
            }

            int start = rotatedBox.length - 1;
            while (start >= 0 && rotatedBox[start][column] != '*') {
                if (count > 0) {
                    rotatedBox[start--][column] = '#';
                    count--;
                } else {
                    rotatedBox[start--][column] = '.';
                }
            }

        }

        return rotatedBox;
    }
}
