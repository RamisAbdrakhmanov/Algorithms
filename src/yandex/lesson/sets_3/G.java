package yandex.lesson.sets_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        long a = Long.parseLong(reader.readLine());
        Set<String> set = new HashSet<>();
        long c = a;
        while (c-- > 0) {
            String str = reader.readLine();
            String[] numb = str.split(" ");
            long behind = Long.parseLong(numb[0]);
            long after = Long.parseLong(numb[1]);
            if (behind + after == a - 1 && behind >= 0 && after >= 0) {
                set.add(str);
            }
        }
            System.out.println(set.size());
    }
}
