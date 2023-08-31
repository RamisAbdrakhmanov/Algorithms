package litcode.interview.questions.easy;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        int b = 2;
        System.out.println(new RemoveElement().removeElement(a,b));
        System.out.println(Arrays.toString(a));

    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        int distance = nums.length;
        for (int i = 0; i < distance; i++) {
            if(nums[i] == val){
                if(nums[distance-1] != val ) {
                    nums[i] = nums[distance-1];
                    nums[distance-1] = val;
                }
                count++;
                i--;
                distance--;
            }
        }
        return nums.length - count;
    }
}
