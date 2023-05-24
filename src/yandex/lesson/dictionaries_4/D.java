package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        long i = Long.parseLong(br.readLine());
        int c = 0;
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length + 1];
        for (int j = 0; j < str.length; j++) {
            arr[j + 1] = Integer.parseInt(str[j]);
        }
        long d = Long.parseLong(br.readLine());
        String[] iz = br.readLine().split(" ");
        for (int j = 0; j < iz.length ; j++) {
            int qwe = Integer.parseInt(iz[j]);
            int qwer = arr[qwe];
            arr[qwe] = qwer-1;
        }
        for (int a = 1; a < arr.length ; a++) {
            if(arr[a]<0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        };
    }
}