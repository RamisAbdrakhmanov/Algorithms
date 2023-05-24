package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        System.out.println(getX(a, b, c));
    }

    public static String getX(int a, int b, int c) {

        try {

            if (c < 0) {
                return "NO SOLUTION";
            }
            if (a == 0) {
                if (b == c * c){
                    return "MANY SOLUTIONS";
                } else {
                    return "NO SOLUTION";
                }
            }

            if ((c * c - b) < a) {

            }
            double x = (c * c - b) / ((double) a);

            if (a * x - b < 0) {
                return "NO SOLUTION";
            }
            if ((c * c - b) % a != 0) {
                return "NO SOLUTION";
            }

            return String.valueOf((int) x);
        } catch (ArithmeticException e) {
            return "NO SOLUTION";
        }
    }

}
