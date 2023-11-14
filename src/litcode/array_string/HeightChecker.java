package litcode.array_string;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] x = new int[3];
        System.out.println(Arrays.toString(x));
    }
    public static int heightChecker(int[] heights) {
        int[] expect = heights.clone();
        Arrays.sort(expect);
        int count =0;
        for(int i = 0; i < expect.length; i++){
            if(expect[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
