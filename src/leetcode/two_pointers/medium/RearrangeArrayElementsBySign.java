package leetcode.two_pointers.medium;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {

        int[] arr = new int[nums.length];
        int p = 0;
        int n = 1;

        for (int num : nums) {
            if (num < 0) {
                arr[n] = num;
                n += 2;
            } else {
                arr[p] = num;
                p += 2;
            }
        }

       System.arraycopy(arr,0,nums,0,arr.length);

        return nums;
    }
}
