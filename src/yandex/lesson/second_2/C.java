package yandex.lesson.second_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(reader.readLine());
        String[] b = reader.readLine().split(" ");
        /*List<Integer> b = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).toList();*/
        int c = Integer.parseInt(reader.readLine());
        System.out.println(getClose(b, c));

    }

    public static int getClose(String[] b, int c) {
        int minMOD = 200000;
        int min = 200000;
        for (int i = 0; i < b.length; i++) {
            int check = Math.abs(c - Integer.parseInt(b[i]));
            if (check <= minMOD) {
                minMOD = check;
                min = Integer.parseInt(b[i]);
            }
        }
        return min;
    }
}
