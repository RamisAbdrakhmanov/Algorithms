package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String arg = reader.readLine();
        String[] numbStr = arg.split(" ");
        int a = Integer.parseInt(numbStr[0]);
        int b = Integer.parseInt(numbStr[1]);
        int c = Integer.parseInt(numbStr[2]);
        int d = Integer.parseInt(numbStr[3]);
        System.out.println(getMin(a,b,c,d));
    }

    public static String getMin(int a, int b, int c, int d) {
        int first = (a + c) * Math.max(b, d);
        int two = (a + d) * Math.max(b, c);
        int free = (b + c) * Math.max(a, d);
        int four = (b + d) * Math.max(a, c);

        int min = Math.min(Math.min(first, two), Math.min(free, four));
        if(min == first){
            return (a+c) + " " + Math.max(b, d);
        }
        if(min == two){
            return (a+d) + " " + Math.max(b, c);
        }
        if(min == free){
            return (c+b) + " " + Math.max(a, d);
        }
        if(min == four){
            return (d+b) + " " + Math.max(a, c);
        }
        return null;
    }
}
