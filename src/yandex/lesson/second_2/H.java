package yandex.lesson.second_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] b = reader.readLine().split(" ");
        List<Long> integerList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            integerList.add(Long.parseLong(b[i]));
        }
        System.out.println(getAnswer(integerList));

    }

    public static String getAnswer(List<Long> integerList) {
        if (integerList.size() >= 5) {
            long maxUp = Integer.MIN_VALUE;
            long maxMid = Integer.MIN_VALUE;
            long maxDown = Integer.MIN_VALUE;
            long minUp = Integer.MAX_VALUE;
            long minDown = Integer.MAX_VALUE;
            for (int i = 0; i < integerList.size(); i++) {
                long j = integerList.get(i);
                if (j >= maxUp) {
                    if (j >= maxMid) {
                        if (j >= maxDown) {
                            maxUp = maxMid;
                            maxMid = maxDown;
                            maxDown = j;
                        } else {
                            maxUp = maxMid;
                            maxMid = j;
                        }
                    } else {
                        maxUp = j;
                    }
                }


                if (j <= minUp) {
                    if (j <= minDown) {
                        minUp = minDown;
                        minDown = j;
                    } else {
                        minUp = j;
                    }
                }
            }
            List<Long> list = new ArrayList<>();
            list.add(maxDown);
            list.add(maxMid);
            list.add(maxUp);
            list.add(minDown);
            list.add(minUp);
            return geta(list);
        } else {

            return geta(integerList);
        }
    }

    public static String geta(List<Long> integerList){
        long max = Long.MIN_VALUE;
        long numb1 = Integer.MIN_VALUE;
        long numb2 = Integer.MIN_VALUE;
        long numb3 = Integer.MIN_VALUE;
        for (int i = 0; i < integerList.size() - 2; i++) {
            for (int j = i+1; j < integerList.size()-1; j++) {
                for (int k = j+1; k < integerList.size(); k++) {
                    if (integerList.get(i) * integerList.get(j)*integerList.get(k) > max) {
                        max = integerList.get(i) * integerList.get(j)*integerList.get(k);
                        numb1 = integerList.get(i);
                        numb2 = integerList.get(j);
                        numb3 = integerList.get(k);
                    }
                }

            }
        }
        return numb1 + " " + numb2 + " " + numb3;
    }

}
