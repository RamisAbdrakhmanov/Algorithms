package aaaTESTaaa;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

        int[] a = new int[10];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = (int) (Math.random() * 10);
        }

        System.out.println(searchGap(a));
    }

    public static List<Integer> searchGap(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != -1 && num != i ) {
                while (num != -1 && nums[num] != -1) {
                    int temp = nums[num];
                    nums[num] = -1;
                    num = temp;
                }

            } else {
                nums[i] = -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                list.add(i);
            }
        }

        return list;
    }
}
