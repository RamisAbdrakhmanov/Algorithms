package yandex.summer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlatformGame {
    public static void main(String[] args) throws FileNotFoundException {

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String a = br.readLine();

            char[] chars = br.readLine().toCharArray();

            List<Integer> list = new ArrayList<>();

            int prev = 1;
            for (int i = 0; i < chars.length; i++) {
                switch (chars[i]) {
                    case 'R' -> prev = 1;
                    case 'L' -> prev = -1;
                    default -> {
                        int j = i+1;
                        while (j < chars.length && chars[j] == 'F'){
                            j++;
                        }
                        list.add((j-i)*prev);
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
