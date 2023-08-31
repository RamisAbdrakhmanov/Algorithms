package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NumbTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] range = reader.readLine().split(" ");
        int min = range[0].length();
        int max = range[1].length();
        if (max > min) {
            String[] splitMin = range[0].split("");
            int differenceMin = 10 - Integer.parseInt(splitMin[0]);
            int sum = differenceMin;
            while (min != max - 1) {
                min++;
                sum += 9;
            }
            String[] splitMax = range[1].split("");
            boolean check = true;
            int firstMax = Integer.parseInt(splitMax[0]);
            for (String s : splitMax) {
                if (Integer.parseInt(s) < firstMax) {
                    check = false;
                }
            }
            if (check) {
                sum += firstMax;
            } else {
                sum += firstMax - 1;
            }
            System.out.println(sum);

        } else if (min == max) {
            long first = Long.parseLong(range[0]);
            long second = Long.parseLong(range[1]);

            String[] splitMin = range[0].split("");
            String[] splitMax = range[1].split("");
            int firstMin = Integer.parseInt(splitMin[0]);
            int firstMax = Integer.parseInt(splitMax[0]);

            if (second < first) {
                System.out.println(0);
            } else {
                List<StringBuilder> list = new ArrayList<>();
                for (int i = firstMin; i <= firstMax; i++) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(String.valueOf(i).repeat(splitMin.length));
                    list.add(stringBuilder);
                }
                int sum = 0;
                for (StringBuilder st : list) {
                    long a = Long.parseLong(String.valueOf(st));
                    if (first <= a && second >= a) {
                        sum += 1;
                    }
                }
                System.out.println(sum);
            }
        } else {
            System.out.println(0);
        }
    }
}
