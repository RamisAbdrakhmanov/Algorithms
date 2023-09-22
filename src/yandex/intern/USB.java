package yandex.intern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class USB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        long compUSB = Long.parseLong(br.readLine());
        long gadgets = Long.parseLong(br.readLine());
        int priceTwo = Integer.parseInt(br.readLine());
        int priceFive = Integer.parseInt(br.readLine());


        System.out.println(getSum(compUSB,gadgets,priceTwo,priceFive));
    }

    public static long getSum(long compUSB, long gadgets, int priceTwo, int priceFive){
        if(compUSB>=gadgets){
            return 0;
        }
        long sum = 0;
        if (4 * priceTwo < priceFive) {
            sum = priceTwo * (gadgets-compUSB);
        } else {
            sum = (gadgets-compUSB) / 4 * priceFive;
            long remainder = (gadgets-compUSB) % 4;
            if (remainder * priceTwo < priceFive) {
                sum += remainder * priceTwo;
            } else {
                sum += priceFive;
            }
        }
        return sum;
    }

}
