package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

       /* List<Integer> sides = new ArrayList<>();
        while (reader.ready()) {
            sides.add(Integer.parseInt(reader.readLine()));
        }

        System.out.println(getAnswer(sides));*/
    }

    public static String getAnswer(List<Integer> list) {
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        if (a + b > c && b + c > a && a + c > b) {
            return "YES";
        } else {
            return "NO";
        }

    }


}
