package yandex.lesson.second_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int с = Integer.parseInt(reader.readLine());
        String[] b = reader.readLine().split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            integerList.add(Integer.parseInt(b[i]));
        }
        List<Integer> arr = new ArrayList<>(integerList);

        getList(integerList);

        System.out.println(integerList.size() - arr.size());
        for (int i = integerList.size() - 1; i >= arr.size(); i--) {
            System.out.print(integerList.get(i) + " ");
        }


    }

    public static void getList(List<Integer> list) {
        int d = list.size();
        int count = 0;
        while (!checkPol(list)) {
            list.add(list.get(count));
            count++;
            if (count + 1 == d) {
                return;
            }
        }
    }

    public static boolean checkPol(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list.get(list.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /*public static int prefix(List<Integer> list) {

Алгоритм Кнута–Морриса-Пратта


        int count = 0;
        int max = 0;
        while (count < list.size()/2) {
            int s = 0;
            for (int i = 0; true; i++) {
                int a = list.get(list.size() - 1 - i);
                int b = list.get(list.get(list.size() - count + i));
                System.out.println( a + " : " +b);
                if (a == b) {
                    System.out.print( list);
                    ++s;
                    if (s > max) {
                        max = s;
                    }
                } else {
                    s = 0;
                    break;
                }
            }
            count++;
        }
        return max+1;
    }*/
}
