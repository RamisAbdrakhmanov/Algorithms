package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Numb {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] condition = br.readLine().split(" ");
        String[] numbs = br.readLine().split(" ");
        long numberOfChanges = Integer.parseInt(condition[1]);
        Queue<GoodNumb> queue = new PriorityQueue<>();

        for (int i = 0; i < numbs.length; i++) {
            String[] numb = numbs[i].split("");
            int count = 0;
            int sumPlus = 0;
            while (count <= numb.length - 1) {
                if (Integer.parseInt(numb[count]) != 9) {
                    sumPlus = (9 - Integer.parseInt(numb[count]));
                    while (count != numb.length - 1) {
                        count++;
                        sumPlus *= 10;
                    }
                    break;
                }
                count++;
            }
            GoodNumb goodNumb = new GoodNumb(i, sumPlus);

            if (i < numberOfChanges) {
                queue.add(goodNumb);
            } else {
                assert queue.peek() != null;
                if (goodNumb.sumPlus > queue.peek().sumPlus) {
                    queue.poll();
                    queue.add(goodNumb);
                }
            }
        }

        long sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.poll().sumPlus;
        }

        System.out.println(sum);
    }


}

class GoodNumb implements Comparable<GoodNumb> {
    int index;
    int sumPlus;

    @Override
    public int compareTo(GoodNumb o) {
        return this.sumPlus - o.sumPlus;
    }

    public GoodNumb(int index, int sumPlus) {
        this.index = index;
        this.sumPlus = sumPlus;
    }

}

