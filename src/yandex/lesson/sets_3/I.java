package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(br.readLine());
        int check = a;
        HashMap<String, Integer> map = new HashMap<>();
        while (a-- > 0) {
            int b = Integer.parseInt(br.readLine());
            while (b-- > 0) {
                String s = br.readLine();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        int count = 0;
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            if (s.getValue() == check) {
                count++;
            }
        }
        System.out.println(count);
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            if (s.getValue() == check) {
                System.out.println(s.getKey());
            }
        }
        System.out.println(map.size());
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s.getKey());
        }

    }
}
