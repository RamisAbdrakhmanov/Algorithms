package leetcode.two_pointers.easy;

public class MaximumEnemyFortsThatCanBCaptured {
    public int captureForts(int[] forts) {
        int prev = 0;
        int max = 0;
        for (int i = 0; i < forts.length; i++) {
            if(forts[i] != 0){
                if(forts[i] == -forts[prev]){
                    max = Math.max(max,i - prev - 1);
                }
                prev = i;
            }
        }
        return max;
    }
}
