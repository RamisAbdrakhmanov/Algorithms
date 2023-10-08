package litcode.LeetCode75.two_pointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfK_SumPairs {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 0; j < 1000; j++) {

            int[] nums = new int[100000];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) (Math.random() * 10000000);
            }

            long startTime2 = System.nanoTime();
            maxOperations1(nums, (int) (Math.random() * 10000000));
            long endTime2 = System.nanoTime();
            long duration2 = (endTime2 - startTime2);

            long startTime1 = System.nanoTime();
            maxOperations(nums, (int) (Math.random() * 10000000));
            long endTime1 = System.nanoTime();
            long duration1 = (endTime1 - startTime1);

            if(duration1< duration2){
                count++;
            }
        }
        System.out.println(count);

    }

    public static int maxOperations1(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>(100000,1);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.containsKey(k - entry.getKey())) {
                count += Math.min(map.get(k - entry.getKey()), entry.getValue());
            }
        }
        return count / 2;
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int temp = nums[left] + nums[right];
            if (k == temp) {
                count++;
                left++;
                right--;
            } else if (temp < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
