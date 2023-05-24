package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        System.out.println(getAnswer(a,b,c,d,e));
    }

    public static String getAnswer(int a,int b, int c, int d,int e){
        List<Integer> sidesOfBrick = new ArrayList<>();
        List<Integer> sidesOfRectangle = new ArrayList<>();
        sidesOfBrick.add(a);
        sidesOfBrick.add(b);
        sidesOfBrick.add(c);
        sidesOfRectangle.add(d);
        sidesOfRectangle.add(e);
        Collections.sort(sidesOfBrick);
        Collections.sort(sidesOfRectangle);

        if(sidesOfRectangle.get(0)>=sidesOfBrick.get(0) && sidesOfRectangle.get(1)>=sidesOfBrick.get(1)){
            return "YES";
        }else {
            return "NO";
        }
    }
}
