package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] b = reader.readLine().split(" ");
        Set<Integer> integerList = new TreeSet<>();
        for (String s : b) {
            integerList.add(Integer.parseInt(s));
        }
        String[] c = reader.readLine().split(" ");
        Set<Integer> integerList2 = new TreeSet<>();
        for (String s : c) {
            integerList2.add(Integer.parseInt(s));
        }
        integerList.retainAll(integerList2);
        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }
    }
}
