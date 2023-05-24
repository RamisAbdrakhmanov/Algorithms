package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] b = reader.readLine().split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            integerList.add(Integer.parseInt(b[i]));
        }
        System.out.println(getAns(integerList));
    }
    public static int getAns(List<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(!map.containsKey(list.get(i))){
                map.put(list.get(i),1);
            } else {
                map.put(list.get(i), map.get(list.get(i))+1);
            }
        }
        return map.size();
    }
}
