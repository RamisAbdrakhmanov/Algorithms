package litcode.arr_2d;

public class KnightDialer {
    public int knightDialer(int n) {
        return (int) ((10 * Math.pow(2,n-1))% Math.pow(10,9));
    }
}
