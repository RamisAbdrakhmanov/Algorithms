package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Set<String> list = new HashSet<>(List.of(reader.readLine().split(" ")));
        Set<String> list2 = new HashSet<>(List.of(reader.readLine().split("")));
        list2.removeAll(list);
        System.out.println(list2.size());
    }
}
