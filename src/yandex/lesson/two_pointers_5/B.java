package yandex.lesson.two_pointers_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));

        String[] abc = bufferedReader.readLine().split(" ");
        String[] xyz = bufferedReader.readLine().split(" ");

        char[] check = abc[1].toCharArray();
        int sumCheck = 0;
        for (char a : check) {
            sumCheck += Character.digit(a,10);
        }

        int count = 0;

        for (int i = 0; i < xyz.length - 1; i++) {
            char[] a = xyz[i].toCharArray();
            char[] b = xyz[i+1].toCharArray();

            int sum = 0;
            for (char x : a) {
                sum += Character.digit(x,10);
            }
            for (char x : b) {
                sum += Character.digit(x,10);
            }

            if (sum == sumCheck) {
                count++;
            }
        }

        char[] a = xyz[0].toCharArray();
        char[] b = xyz[xyz.length-1].toCharArray();
        int sum1 = 0;
        int sum2 = 0;
        for (char x : a) {
            sum1 += Character.digit(x,10);
        }
        for (char x : b) {
            sum2 += Character.digit(x,10);
        }

        if (sum1 == sumCheck) {
            count++;
        }
        if (sum2 == sumCheck) {
            count++;
        }


        System.out.println(count);
    }
}
