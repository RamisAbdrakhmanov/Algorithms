package leetcode.binary_search;

public class H_IndexII {

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{0,0,0,0,0,0,0,0,0}));
    }
    public static int hIndex(int[] c) {
        int l = 0;
        int r = c.length -1;
        while(l <= r){
            System.out.println(l + " : " + r);
            int m = l + (r-l)/2;
            System.out.println(m);

            if(c[m] == c.length - m){
                return c.length - m;
            }

            if(c[m] < c.length - m){
                l = m + 1;
            }else {
                r = m-1;
            }
        }

        return c.length - l;
    }
}
