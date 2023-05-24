package litcode.algorithmOne.TwoPointers;

import java.io.*;
import java.util.*;


public class as {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        List<String> list = new ArrayList<>();
        while (reader.ready()) {
            list.add(reader.readLine());
        }
        int max = 0;
        int changeMax = Integer.parseInt(list.get(0));

        String[] bukva = list.get(1).split("");
        int del = 0;

        Set<String> set = Set.of("abcdefghijklmnopqrstuvwxyz".split(""));

        for (String s : set) {
            int count = 0;
            int change = changeMax;
            for (int i = 0; i < bukva.length; i++) {
                if (s.equals(bukva[i])) {
                    count += 1;
                    if (i == bukva.length - 1) {
                        count += change;
                    }
                } else  if (!(s.equals(bukva[i])) && (count != 0)) {
                    if(changeMax == change){
                        del = i;
                    }
                    if (change != 0) {
                        count += 1;
                        change -= 1;
                        if (i == bukva.length - 1) {
                            count += change;
                        }
                    } else {
                        i=del;
                        count = 0;
                        change = changeMax;
                    }
                }
                if (count > max) {
                    max = count;
                }


            }

        }
        System.out.println(max);
        reader.close();
    }
}
