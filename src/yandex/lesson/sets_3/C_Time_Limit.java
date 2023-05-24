package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class C_Time_Limit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] b = reader.readLine().split(" ");
        int anna = Integer.parseInt(b[0]);
        int boris = Integer.parseInt(b[1]);
        Set<Integer> listAnna = new TreeSet<>();
        Set<Integer> listBoris = new TreeSet<>();
        while (anna-->0){
            listAnna.add(Integer.parseInt(reader.readLine()));
        }
        while (boris-->0){
            listBoris.add(Integer.parseInt(reader.readLine()));
        }
        Set<Integer> duplicateAnna = new TreeSet<>(listAnna);
        Set<Integer> duplicateAnna2 = new TreeSet<>(listAnna);
        duplicateAnna.retainAll(listBoris);

        System.out.println(duplicateAnna.size());
        for (Integer a : duplicateAnna){
            System.out.print(a + " ");
        }
        listAnna.removeAll(listBoris);
        System.out.println("\n"+listAnna.size());
        for(Integer a : listAnna){
            System.out.print(a + " ");
        }
        listBoris.removeAll(duplicateAnna2);
        System.out.println("\n"+listBoris.size());
        for(Integer a : listBoris){
            System.out.print(a + " ");
        }
    }
}
