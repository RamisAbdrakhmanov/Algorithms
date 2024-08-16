package leetcode.array_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int[] temp = new int[r[i] - l[i] + 1];
            int index = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                temp[index++] = nums[j];
            }

            Arrays.sort(temp);

            list.add(isArithmetic(temp));
        }

        return list;
    }

    public boolean isArithmetic(int[] arr){
        int dif = arr[0] - arr[1];
        for (int j = 2; j < arr.length; j++) {
            if(arr[j-1] - arr[j] != dif){
                return false;
            }
        }

        return true;
    }
}
