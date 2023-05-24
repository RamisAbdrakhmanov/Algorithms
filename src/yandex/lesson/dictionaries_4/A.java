package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        long i = Long.parseLong(br.readLine());
        HashMap<String, String> str = new HashMap<>();
        while (i-- > 0) {
            String[] a = br.readLine().split(" ");
            str.put(a[0],a[1]);
            str.put(a[1],a[0]);
        }
        String word = br.readLine();
        System.out.println(str.get(word));
    }
}
