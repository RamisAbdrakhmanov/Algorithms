package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String arg = reader.readLine();
        String[] numbStr = arg.split(" ");
        int a = Integer.parseInt(numbStr[0]);
        int b = Integer.parseInt(numbStr[1]);
        int c = Integer.parseInt(numbStr[2]);
        System.out.println(getDetail(a,b,c,0));

    }

    public static int getDetail(int a, int b, int c, int count){
        int cnt = count;
        if( c>b || b>a){
            return cnt;
        }
        cnt = cnt + (a/b)*(b/c);
        if(count == cnt){
            return cnt;
        } else {
            int x = a%b;
            int y = b%c;
            int z = ((a/b)*y)+x;
            return getDetail(z,b,c,cnt);
        }
    }
}
