package tinkoff.automn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] segment = br.readLine().split(" ");
        String[] luckyLine = br.readLine().split(" ");
        int begin = 0;
        int end = luckyLine.length-1;
        for (int i = 0; i < segment.length; i++) {
            int a = Integer.parseInt(segment[i]);
            int b = Integer.parseInt(luckyLine[i]);
            if (a != b) {
                begin = i;
                break;
            }
        }

        for (int i = segment.length - 1; i >= 0; i--) {
            int a = Integer.parseInt(segment[i]);
            int b = Integer.parseInt(luckyLine[i]);
            if (a != b) {
                end = i;
                break;
            }
        }

        List<Integer> swap = new ArrayList<>();
        List<Integer> noSwap = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            int a = Integer.parseInt(segment[i]);
            int b = Integer.parseInt(luckyLine[i]);
            swap.add(a);
            noSwap.add(b);
        }

        if (!swap.equals(noSwap)) {
            Collections.sort(swap);
            if (swap.equals(noSwap)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("YES");
        }
    }
}
