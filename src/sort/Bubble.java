package sort;

import java.util.Arrays;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) throws InterruptedException {

        int[] a  = new int[100];
        for (int i = a.length-1; i >= 0; i--) {
            a[i] = (int) (Math.random() * 1000);
        }
        new Bubble().sort(a);
        System.out.println(Arrays.toString(a));

    }
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

}
