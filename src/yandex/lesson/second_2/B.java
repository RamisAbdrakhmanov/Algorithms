package yandex.lesson.second_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        List<Integer> list = new ArrayList<>();
        int line = 0;
        while (line != -2000000000) {
            line = Integer.parseInt(reader.readLine());
            list.add(line);
        }
        System.out.println(getNameList(list));
    }

    public static String getNameList(List<Integer> list) {
        Map<String, Integer> map = new HashMap<>();
        map.put("=", 0);
        map.put(">", 0);
        map.put("<", 0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) < list.get(i)) {
                map.put("<", map.get("<") + 1);
            } else if (list.get(i - 1) > list.get(i)) {
                map.put(">", map.get(">") + 1);
            } else {
                map.put("=", map.get("=") + 1);
            }
        }
        if (map.get(">") > 0 && map.get("=") > 0 && map.get("<") == 0) {
            return "WEAKLY DESCENDING";
        } else if (map.get(">") > 0 && map.get("=") == 0 && map.get("<") == 0) {
            return "DESCENDING";
        } else if (map.get("<") > 0 && map.get("=") > 0 && map.get(">") == 0) {
            return "WEAKLY ASCENDING";
        } else if (map.get("<") > 0 && map.get("=") == 0 && map.get(">") == 0) {
            return "ASCENDING";
        } else if (map.get(">") == 0 && map.get("<") == 0) {
            return "CONSTANT";
        } else {
            return "RANDOM";
        }

    }

}
