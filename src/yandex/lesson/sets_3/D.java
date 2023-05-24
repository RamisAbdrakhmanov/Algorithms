package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Set<String> list = new HashSet<>();
        while (reader.ready()) {
           String[] b = reader.readLine().split(" ");
           for (String s : b){
              if(!Objects.equals(s, "")) {
                  list.add(s);
              }
           }
        }

        System.out.println(list.size());
    }
}
