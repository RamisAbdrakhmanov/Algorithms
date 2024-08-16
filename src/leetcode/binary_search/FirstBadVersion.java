package leetcode.binary_search;

public class FirstBadVersion /*extends VersionControl */{
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        int firstBad = n;
        /*while(l <= r){
            int m = l + (r - l)/2;
            if(isBadVersion(m)){
                firstBad = Math.min(firstBad,m);
                r = m-1;
            } else {
                l = m+1;
            }
        }*/
        return firstBad;
    }
}

