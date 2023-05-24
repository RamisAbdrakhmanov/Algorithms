package yandex.lesson.second_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] b = reader.readLine().split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            integerList.add(Integer.parseInt(b[i]));
        }
        System.out.println(getAnswer(integerList));

    }

    public static String getAnswer(List<Integer> integerList) {
        if (integerList.size() >= 5) {
            long maxUp = Integer.MIN_VALUE;
            long maxMid = Integer.MIN_VALUE;
            long maxDown = Integer.MIN_VALUE;
            long minUp = Integer.MAX_VALUE;
            long minDown = Integer.MAX_VALUE;
            for (int i = 0; i < integerList.size(); i++) {
                int j = integerList.get(i);
                if (j > maxUp) {
                    if(j>minDown) {
                        if (j > maxDown) {
                            maxUp = maxDown;
                            maxDown = j;
                        } else {
                            maxUp = j;
                        }
                    }
                }
                if (j < minUp) {
                    if (j < minDown) {
                        minUp = minDown;
                        minDown = j;
                    } else {
                        minUp = j;
                    }
                }
            }
            if (maxUp * maxDown > minUp * minDown) {
                return maxUp + " " + maxDown;
            } else {
                return minDown + " " + minUp;
            }
        } else {
            int max = Integer.MIN_VALUE;
            int numb1 = 0;
            int numb2 = 0;
            for (int i = 0; i < integerList.size() - 1; i++) {
                for (int j = 1; j < integerList.size(); j++) {
                    if (integerList.get(i) * integerList.get(j) > max) {
                        max = integerList.get(i) * integerList.get(j);
                        if (integerList.get(i) > integerList.get(j)){
                            numb1 = integerList.get(j);
                            numb2 = integerList.get(i);
                        }else {
                            numb2 = integerList.get(j);
                            numb1 = integerList.get(i);
                        }
                    }
                }
            }
            return numb1 + " " + numb2;
        }
    }


}