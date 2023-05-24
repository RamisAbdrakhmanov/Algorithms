package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] a = reader.readLine().split(" ");
        int length = Integer.parseInt(a[0]);
        Map<Character, Integer> map = new HashMap<>();

        char[] d = reader.readLine().toCharArray();
        for (char s : d) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        char[] b = reader.readLine().toCharArray();
        int count = 0;
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char s = b[i];
            if (map2.containsKey(s)) {
                map2.put(s, map2.get(s) + 1);
            } else {
                map2.put(s, 1);
            }
        }
        if (map.equals(map2)) {
            count++;
        }
        for (int i = length; i < b.length; i++) {
            char s1 = b[i - length];
            char s2 = b[i];


            if (map2.get(s1) > 1) {
                map2.put(s1, map2.get(s1) - 1);
            } else {
                map2.remove(s1);
            }
            if (map2.containsKey(s2)) {
                map2.put(s2, map2.get(s2) + 1);
            } else {
                map2.put(s2, 1);
            }
            if (map.equals(map2)) {
                count++;

            }

        }
        System.out.println(count);
    }
}
