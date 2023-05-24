package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println(getMinAndMax(a,b,c,d));


    }

    public static String getMinAndMax(int a, int b, int c, int d){
        int minA = a*(c-1)+c;
        int maxA = a*(c+1)+c;

        int minB=b*(d-1)+d;
        int maxB=b*(d+1)+d;

        if(minB>maxA ||  minA>maxB){
            return "-1";
        }
        List<Integer> list = new ArrayList<>();
        list.add(minA);
        list.add(minB);
        list.add(maxA);
        list.add(maxB);
        Collections.sort(list);

        return list.get(1) + " " + list.get(2);
    }
}
