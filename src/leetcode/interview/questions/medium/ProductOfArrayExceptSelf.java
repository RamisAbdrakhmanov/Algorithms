package leetcode.interview.questions.medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {0, 4, 0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (product * nums[i] != 0) {
                product *= nums[i];
            } else {
                list.add(i);
            }
        }
        if (list.size() > 1) {
            return answer;
        }
        if (list.size() == 0) {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = product / nums[i];
            }
        } else {
            for (Integer i : list) {
                answer[i] = product;
            }
        }
        return answer;
    }
}
