package yandex.cup23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Haiku {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        System.out.println(new Haiku().makeHaiku("reader.readLine())"));
    }

    public String makeHaiku(String s) {
        if (s.length() == 9) {
            return "YandexCup";
        }
        char[] str1 = s.toCharArray();

        int[] arrC = new int[3];

        for (int i = str1.length - 3; i >= 0; i--) {
            int changes = countChangesForCup(str1, i);
            if (changes == 0 && arrC[0] == 0) {
                arrC[0] = i;
                if (arrC[1] == 0 && arrC[2] == 0) {
                    break;
                }

            } else if (changes == 1 && arrC[1] == 0) {
                arrC[1] = i;
                if (arrC[0] != 0 && arrC[2] == 0) {
                    break;
                }
            } else if (changes == 2 && arrC[2] == 0) {
                arrC[2] = i;
                if (arrC[0] != 0 && arrC[1] != 0) {
                    break;
                }
            }
        }

        int min = 9;
        int[] poz = new int[2];

        for (int i = 0; i < str1.length - 8; i++) {
            int changes = countChangesForYandex(str1, i);
            if (changes < 6) {
                for (int j = 0; j < arrC.length; j++) {
                    if (i + 5 < arrC[j] && changes + j < min) {
                        min = changes + j;
                        poz[0] = i;
                        poz[1] = arrC[j];
                    }
                }
            }
        }
        if (poz[0] == 0 && poz[1] == 0) {
            poz[1] = 6;
        }
        changeYandex(str1, poz[0]);
        changeCup(str1, poz[1]);

        return new String(str1);
    }

    void changeYandex(char[] chars, int poz) {
        chars[poz++] = 'Y';
        chars[poz++] = 'a';
        chars[poz++] = 'n';
        chars[poz++] = 'd';
        chars[poz++] = 'e';
        chars[poz] = 'x';
    }

    void changeCup(char[] chars, int poz) {
        chars[poz++] = 'C';
        chars[poz++] = 'u';
        chars[poz] = 'p';
    }

    int countChangesForYandex(char[] chars, int poz) {
        int count = 0;
        if (chars[poz++] != 'Y') {
            count++;
        }
        if (chars[poz++] != 'a') {
            count++;
        }
        if (chars[poz++] != 'n') {
            count++;
        }
        if (chars[poz++] != 'd') {
            count++;
        }
        if (chars[poz++] != 'e') {
            count++;
        }
        if (chars[poz] != 'x') {
            count++;
        }

        return count;
    }

    int countChangesForCup(char[] chars, int poz) {
        int count = 0;
        if (chars[poz++] != 'C') {
            count++;
        }
        if (chars[poz++] != 'u') {
            count++;
        }
        if (chars[poz] != 'p') {
            count++;
        }

        return count;
    }

}
