package leetcode.daily;

import java.util.Arrays;

public class PartitionArrayForMaximumSum {
    public static void main(String[] args) {
        System.out.println(maxSumAfterPartitioning(new int[]{1,4,1,5,7,3,6,1,9,9,3},4));
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        Arrays.sort(arr);
        int iterator = 0;

        int sum = 0;
        while (iterator < arr.length / k) {
            sum += arr[arr.length - 1 - iterator++] * k;
        }
        sum += arr[arr.length - 1 - iterator] * (arr.length % k);

        return sum;
    }
}
