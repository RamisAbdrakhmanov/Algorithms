package yandex.cup23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CatsInArt {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int count = Integer.parseInt(reader.readLine().split(" ")[1]);
        String[] s = reader.readLine().split(" ");


        PriorityQueue<TestTube> ts = new PriorityQueue<>(Comparator.comparingInt(o -> o.price));

        for (int i = 0; i < s.length; i++) {
            ts.add(new TestTube(Integer.parseInt(s[i]), i));
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < count - 1; i++) {
            TestTube t = ts.poll();
            max = Math.max(t.poz, max);
            min = Math.min(t.poz, min);
        }

        int minAbs = Math.min(Math.abs(max - ts.peek().price), Math.abs(min - ts.peek().price));
        while (!ts.isEmpty()) {
            TestTube t = ts.poll();
            int price = t.price;
            if (min <= price && price <= max) {
                minAbs = 0;
                break;
            }
            int minAbcT = Math.min(Math.abs(max - price), Math.abs(min - price));
            if (minAbcT < minAbs) {
                minAbs = minAbcT;
            }
            max = Math.max(t.poz, max);
            min = Math.min(t.poz, min);
        }

        System.out.println(max - min + minAbs+1);

    }

}

class TestTube {
    int price;
    int poz;

    public TestTube(int price, int poz) {
        this.price = price;
        this.poz = poz;
    }

}
