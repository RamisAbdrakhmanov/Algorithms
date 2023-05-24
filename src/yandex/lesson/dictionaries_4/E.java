package yandex.lesson.dictionaries_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        long length = Long.parseLong(br.readLine());
        Map<Long, Long> map = new HashMap<>();
        while (length-- > 0) {
            String[] str = br.readLine().split(" ");
            Long width = Long.parseLong(str[0]);
            Long height = Long.parseLong(str[1]);
            if (width > 0 && height > 0) {
                if (map.containsKey(width)) {
                    if (map.get(width) < height) {
                        map.put(width, height);
                    }
                } else {
                    map.put(width, height);
                }
            }
        }

        Long heightTotal = 0L;
        for (Long a: map.values()){
            heightTotal += a;
        }
        System.out.println(heightTotal);

    }
}
