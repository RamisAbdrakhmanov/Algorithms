package yandex.lesson.second_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] b = reader.readLine().split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            integerList.add(Integer.parseInt(b[i]));
        }
        System.out.println(getCount(integerList));

    }

    public static int getCount(List<Integer> list){
        int count = 0;
        for (int i = 1; i < list.size()-1; i++) {
            if(list.get(i-1)<list.get(i) && list.get(i)>list.get(i+1)){
                count++;
            }
        }

        return count;
    }


}
