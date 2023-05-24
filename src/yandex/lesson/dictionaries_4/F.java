package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, TreeMap<String, String>> map = new TreeMap<>();
        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");
            if (map.containsKey(str[0])) {
                Map<String, String> count = map.get(str[0]);
                if (count.containsKey(str[1])) {
                    Long a = Long.parseLong(count.get(str[1]));
                    Long b = Long.parseLong(str[2]);
                    Long sum = a + b;
                    count.put(str[1], String.valueOf(sum));
                } else {
                    count.put(str[1], str[2]);
                }
            } else {
                TreeMap<String, String> count = new TreeMap<>();
                count.put(str[1], str[2]);
                map.put(str[0], count);
            }
        }
        for (Map.Entry<String, TreeMap<String, String>> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + ":");
            for (Map.Entry<String, String> entry : mapEntry.getValue().entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

}
