package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        Map<String, Integer> map = new TreeMap<>();
        int max = 0;
        while (br.ready()) {
            String[] str = br.readLine().split(" ");
            for (String s : str) {
                if (map.containsKey(s)) {
                    int i = map.get(s) + 1;
                    if (max < i) {
                        max = i;
                    }
                    map.put(s, i);
                } else {
                    map.put(s, 1);
                    if (max < 1) {
                        max = 1;
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
