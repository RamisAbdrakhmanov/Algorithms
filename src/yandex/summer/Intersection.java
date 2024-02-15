package yandex.summer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Intersection {

    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            int length = Integer.parseInt(br.readLine());
            int[][] pair = new int[length][2];
            for (int i = 0; i < pair.length; i++) {
                String[] s = br.readLine().split(" ");
                pair[i][0] = Integer.parseInt(s[0]);
                pair[i][1] = Integer.parseInt(s[1]);
            }

            Arrays.sort(pair, Comparator.comparingInt((int[] arg) -> arg[0]));

            Deque<int[]> deque = new LinkedList<>();

            deque.push(pair[0]);

            int prev2 = pair[0][1];

            for (int i = 1; i < pair.length; i++) {
                if (pair[i][0] == pair[i - 1][0]) {
                    if (!deque.isEmpty() && deque.peek() == pair[i - 1]) {
                        deque.pop();
                    }
                } else if (prev2 >= pair[i][1]) {
                    while (!deque.isEmpty() && (deque.peek()[1] >= pair[i][1])) {
                        deque.pop();
                    }
                } else {
                    prev2 = pair[i][1];
                    deque.push(pair[i]);
                }
            }

            System.out.println(deque.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


