package tinkoff.automn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] condition = br.readLine().split(" ");
        String[] prices = br.readLine().split(" ");
        int money = Integer.parseInt(condition[1]);
        int revolver = 0;
        for (String s : prices) {
            int price = Integer.parseInt(s);
            if (money - price > 0 && money - price < money - revolver) {
                revolver = price;
            }
        }
        System.out.println(revolver);
    }
}
