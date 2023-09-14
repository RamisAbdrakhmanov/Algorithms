package tinkoff.automn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Four {
    public static void main(String[] args) throws IOException {
     /*   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] one = br.readLine().split(" ");
        long sum = Long.parseLong(one[0]);
        String[] luckyLine = br.readLine().split(" ");
        int[] arr = new int[luckyLine.length];
        for (int i = 0; i < luckyLine.length; i++) {
            arr[i] = Integer.parseInt(luckyLine[i]);
        }*/

        int[] arr = {1, 2};
        int sum = 8;
        List<Integer> integers = new ArrayList<>();
        req(arr.length, 0, sum, arr, integers);
        if (integers.size() != 0) {
            System.out.println(integers.size());
            for (int s : integers){
                System.out.print(s + " ");
            }
        } else {
            System.out.println(-1);
        }
    }

    public static void req(int a, long sum1, long sum2, int[] arr, List<Integer> integers) {
        for (int i = arr.length - a; i < arr.length; i++) {
            System.out.println(i);
            for (int j = 0; j < 2; j++) {
                sum1 += arr[i];
                if (sum1 == sum2) {
                    integers.add(arr[i]);
                    if (j == 1) {
                        integers.add(arr[i]);
                    }
                    return;
                } else {
                    req(a - 1, sum1, sum2, arr, integers);
                    if (integers.size() != 0) {
                        integers.add(arr[i]);
                        if (j == 1) {
                            integers.add(arr[i]);
                        }
                        return;
                    }
                }
            }
        }
    }
}
