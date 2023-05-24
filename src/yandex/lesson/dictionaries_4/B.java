package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");

            for (String s : str) {
                if (map.containsKey(s)) {
                    int c = map.get(s);
                    System.out.print(c + " ");
                    map.put(s,c+1);
                } else {
                    if(!s.isBlank()) {
                        map.put(s, 1);
                        System.out.print(0 + " ");
                    }
                }
            }
        }
    }
}
