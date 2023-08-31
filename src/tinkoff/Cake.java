package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long numberOfPieces = Integer.parseInt(br.readLine());
        long count = 0;
        long check = 1;
        while (numberOfPieces > check) {
            check*=2;
            count++;
        }
        System.out.println(count);
    }
}
