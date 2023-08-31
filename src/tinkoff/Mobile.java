package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mobile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] b = reader.readLine().split(" ");
        int rate = Integer.parseInt(b[0]);
        int overRate = Integer.parseInt(b[3])-Integer.parseInt(b[1]);
        int sum;
        if(overRate>0){
            sum = rate + overRate*Integer.parseInt(b[2]);
        }else {
            sum = rate;
        }
        System.out.println(sum);
    }
}
