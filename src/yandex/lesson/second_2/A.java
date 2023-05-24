package yandex.lesson.second_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String arg = reader.readLine();
        String[] numbStr = arg.split(" ");

        System.out.println(getAnswer(numbStr));

    }

    public static String getAnswer(String[] numbStr) {
        for (int i = 1; i < numbStr.length; i++) {
            if (Integer.parseInt(numbStr[i - 1]) >= Integer.parseInt(numbStr[i])) {
                return "NO";
            }
        }
        return "YES";
    }
}
