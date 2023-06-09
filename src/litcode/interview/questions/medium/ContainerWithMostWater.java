package litcode.interview.questions.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println( new ContainerWithMostWater().maxArea(new int[]{1,8,6,3,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (left<right){
            max = Math.max(max,Math.min(height[left], height[right])*(right-left));
            if(height[right]>height[left]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}
