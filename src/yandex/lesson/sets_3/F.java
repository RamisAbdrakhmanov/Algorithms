package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String a = reader.readLine();
        String b = reader.readLine();
        HashMap<String,Integer> setA = new HashMap<>();
        Set<String> setB = new HashSet<>();

        for (int i = 0; i < a.length() - 1; i++) {
            String substr = a.substring(i, i + 2);
            if(setA.containsKey(substr)){
                setA.put(substr,setA.get(substr)+1);
            }else {
                setA.put(substr,1);
            }
        }
        for (int i = 0; i < b.length() - 1; i++) {
            String substr = b.substring(i, i + 2);
            setB.add(substr);
        }
        int count = 0;
        for (String s : setB) {
            if(setA.containsKey(s)){
                count+=setA.get(s);
            }
        }

        System.out.println(count);

    }
}
