package litcode.two_pointers.medium;

public class PushDominoes {
    public String pushDominoes(String dominoes) {
        char[] d = dominoes.toCharArray();
        int poz = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 'L') {
                if (poz > 0) {

                    int l = poz;
                    int r = i - 1;

                    while (l < r) {
                        d[l++] = 'R';
                        d[r--] = 'L';

                    }

                } else {

                    fillChars(d, poz, i);

                }
                poz = -(i + 1);
            }

            if (d[i] == 'R') {
                if (poz > 0) {
                    fillChars(d, poz, i);
                }
                poz = i + 1;
            }
        }

        if (poz > 0) {
            fillChars(d, poz, d.length);
        }


        return new String(d);
    }


    private void fillChars(char[] d, int l, int r) {
        char c;
        if (l > 0) {
            c = 'R';
        } else {
            c = 'L';
            l = -l;
        }

        for (int i = l; i < r; i++) {
            d[i] = c;
        }
    }
}
