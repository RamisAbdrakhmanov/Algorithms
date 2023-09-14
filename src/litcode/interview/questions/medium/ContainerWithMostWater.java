package litcode.interview.questions.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 3, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left <= right) {
            int sum = Math.min(height[left], height[right]) * (right - left);
            if (max < sum) {
                max = sum;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
