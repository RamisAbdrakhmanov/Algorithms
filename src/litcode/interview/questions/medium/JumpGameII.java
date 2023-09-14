package litcode.interview.questions.medium;

public class JumpGameII {
    public static void main(String[] args) {
        int[] a = {1,2,1,1,1,1};
        System.out.println(new JumpGameII().jump(a));
    }
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int count = 1;
        int start = 0;
        int end = start + nums[start];
        while (end < nums.length - 1) {
            int subtotal = end;
            int mid = start;
            for (int i = start + 1; i <= end; i++) {
                if (i + nums[i] > subtotal) {
                    subtotal = i + nums[i];
                    mid = i;
                }
            }
            start = mid;
            end = start + nums[start];
            count++;
        }
        return count;
    }
}
