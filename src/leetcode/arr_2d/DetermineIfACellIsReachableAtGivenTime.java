package leetcode.arr_2d;

public class DetermineIfACellIsReachableAtGivenTime {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(fx == sx && sy== fy && t == 1){
            return false;
        }
        int min = Math.max(Math.abs(sx - fx), Math.abs(fy - sy));
        return min <= t;
    }
}
