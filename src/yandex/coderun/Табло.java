package yandex.coderun;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Табло {
    public static void main(String[] args) throws IOException {
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Long> players = new HashMap<>();

        int count = Integer.parseInt(reader.readLine());
        while (count-- > 0) {
            players.put(reader.readLine(), 0l);
        }

        count = Integer.parseInt(reader.readLine());
        ;
        int prevR = 0;
        int prevL = 0;


        while (count-- > 0) {
            String[] news = reader.readLine().split(" ");

            String[] score = news[0].split(":");
            int l = Integer.parseInt(score[0]);
            int r = Integer.parseInt(score[1]);
            players.put(news[1], players.get(news[1]) + (r - prevR) + (l - prevL));

            prevR = r;
            prevL = l;
        }
        long max = 0;
        String name = "";

        for (Map.Entry<String, Long> entry : players.entrySet()) {
            if (entry.getValue() == max) {
                if (name.compareTo(entry.getKey()) < 0) {
                    name = entry.getKey();
                }
            }

            if (entry.getValue() > max) {
                max = entry.getValue();
                name = entry.getKey();
            }
        }

        System.out.println(name + " " + max);

        reader.close();
        writer.close();*/

    }

    public int maxDistance(List<List<Integer>> arrays) {
        int result = 0;

        int min = arrays.getFirst().getFirst();
        int max = arrays.getFirst().getLast();

        for (List<Integer> array : arrays) {
            result = Math.max(result, Math.abs(min - array.getLast()));
            result = Math.max(result, Math.abs(max - array.getFirst()));
            max = Math.max(max, array.getLast());
            min = Math.min(min, array.getFirst());
        }

        return Math.abs(max - min);
    }

}
