package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Map<String, Long> map = new HashMap<>();
        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");
            switch (str[0]) {
                case "BALANCE":
                    if (map.containsKey(str[1])) {
                        System.out.println(map.get(str[1]));
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                case "DEPOSIT":
                    if (map.containsKey(str[1])) {
                        map.put(str[1], map.get(str[1]) + Integer.parseInt(str[2]));
                    } else {
                        map.put(str[1], Long.parseLong(str[2]));
                    }
                    break;
                case "WITHDRAW":
                    if (map.containsKey(str[1])) {
                        map.put(str[1], map.get(str[1]) - Integer.parseInt(str[2]));
                    } else {
                        map.put(str[1], -Long.parseLong(str[2]));
                    }
                    break;
                case "TRANSFER":
                    if (map.containsKey(str[1])) {
                        map.put(str[1], map.get(str[1]) - Long.parseLong(str[3]));
                    } else {
                        map.put(str[1], -Long.parseLong(str[3]));
                    }
                    if (map.containsKey(str[2])) {
                        map.put(str[2], map.get(str[2]) + Long.parseLong(str[3]));
                    } else {
                        map.put(str[2], +Long.parseLong(str[3]));
                    }
                    break;
                case "INCOME":
                    for (Map.Entry<String, Long> entry : map.entrySet()) {
                        if (entry.getValue() > 0) {
                            map.put(entry.getKey(), (entry.getValue() * (Long.parseLong(str[1]) + 100) / 100));
                        }
                    }
                    break;
            }
        }
    }

}
