package litcode.two_pointers.medium;

public class SortColors {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, l++, i);
            } else if (nums[i] == 2) {
                swap(nums, r--, i--);
            }
        }
    }

    private void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
