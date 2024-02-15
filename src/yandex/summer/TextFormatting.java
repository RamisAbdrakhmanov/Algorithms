package yandex.summer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFormatting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        char[] c = br.readLine().toCharArray();

        List<char[]> list = new ArrayList<>();

        int prev = 0;
        int max = 0;


        for (int i = 1; i < c.length; i++) {
            if (!Character.isAlphabetic(c[i])) {

                int len = i - prev;

                max = Math.max(max, i - prev);

                boolean mark = false;

                while (i < c.length && !Character.isAlphabetic(c[i])) {
                    if (c[i] == ',') {
                        mark = true;
                    }
                    i++;
                }

                char[] chars;
                if (mark) {
                    chars = new char[len + 1];
                    chars[chars.length - 1] = ',';
                } else {
                    chars = new char[len];
                }

                System.arraycopy(c, prev, chars, 0, len);
                list.add(chars);
                prev = i;
            }

        }

        if(prev < c.length){
            max = Math.max(max, c.length - prev);
           char[] chars = new char[c.length - prev];
            System.arraycopy(c, prev, chars, 0, c.length - prev);
            list.add(chars);
        }


        max *= 3;

        StringBuilder sb = new StringBuilder();
        for (char[] s : list) {
            if (sb.length() + s.length > max) {
                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb);
                sb = new StringBuilder(new String(s)).append(" ");
            } else {
                sb.append(new String(s)).append(" ");
            }
        }
        if(!sb.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }


    }
}
