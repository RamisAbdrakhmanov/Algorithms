package yandex.lesson.two_pointers_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String countTShirts = bufferedReader.readLine();
        String tShirts = bufferedReader.readLine();
        String countShorts = bufferedReader.readLine();
        String shorts = bufferedReader.readLine();

        List<Integer> abc = new ArrayList<>();
        List<Integer> xyz = new ArrayList<>();

        for (String s : tShirts.split(" ")) {
            abc.add(Integer.parseInt(s));
        }
        for (String s : shorts.split(" ")) {
            xyz.add(Integer.parseInt(s));
        }

        int perfI = abc.get(0);
        int perfO = xyz.get(0);
        int perfDifference = Math.abs(perfO - perfI);
        int key = 0;

        if (abc.size() == 1 || xyz.size() == 1) {
            for (int i = 0; i < xyz.size(); i++) {
                for (int j = 0; j < abc.size(); j++) {
                    int first = xyz.get(i);
                    int second = abc.get(j);
                    int def = Math.abs(first - second);
                    if (def < perfDifference) {
                        perfDifference = def;
                        perfI = abc.get(j);
                        perfO = first;
                    }
                }
            }

        } else {

            for (int first : xyz) {
                int def1 = Math.abs(first - abc.get(key));
                for (int j = key; j < abc.size(); j++) {
                    int second = abc.get(j);
                    int def = Math.abs(first - second);
                    if (def < perfDifference) {
                        perfDifference = def;
                        perfI = abc.get(j);
                        perfO = first;
                    }
                    if (def > def1 || j == abc.size() - 1) {
                        key = j - 1;
                        break;
                    }
                    def1 = def;
                }
            }
        }

        System.out.println(perfI + " " + perfO);

    }
}
