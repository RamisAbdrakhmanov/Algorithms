package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        String d = reader.readLine();
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        set.add("9");
        set.add("0");
        System.out.println(getAnswer(set, a, b));
        System.out.println(getAnswer(set, a, c));
        System.out.println(getAnswer(set, a, d));

    }

    public static String getAnswer(Set<String> set, String a, String b) {
        List<String> list1 = new ArrayList<>();
        Arrays.stream(a.split("")).forEach(s -> {
            if (set.contains(s)) {
                list1.add(s);
            }
        });
        List<String> list2 = new ArrayList<>();
        Arrays.stream(b.split("")).forEach(s -> {
            if (set.contains(s)) {
                list2.add(s);
            }
        });

        for (int i = 0; i < 7; i++) {
            if (!Objects.equals(list2.get(list2.size() - i - 1), list1.get(list1.size() - i - 1))) {
                return "NO";
            }
        }
        switch (list1.size()) {
            case 7:
            case 8:
                if(list2.size()>8) {
                    if (!Objects.equals(list2.get(1), "4") || !Objects.equals(list2.get(2), "9") || !Objects.equals(list2.get(3), "5")) {
                        return "NO";
                    }
                }
                break;
            case 11:
                switch (list2.size()) {
                    case 11:
                        if ((!list1.get(1).equals(list2.get(1)))
                                || (!list1.get(2).equals(list2.get(2)))
                                || (!list1.get(3).equals(list2.get(3)))) {
                            return "NO";
                        }
                        break;
                    case 8:
                    case 7:
                        if (!Objects.equals(list1.get(1), "4") || !Objects.equals(list1.get(2), "9") || !Objects.equals(list1.get(3), "5")) {
                            return "NO";
                        }
                        break;

                }
        }
        return "YES";
    }

}
