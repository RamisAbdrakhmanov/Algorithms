package leetcode.LeetCode75.HashMapSet;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {

        int myJewels = 0;
        for (int i = 0; i < stones.length() ; i++) {
            if(jewels.indexOf(stones.charAt(i)) != -1){
                myJewels++;
            }
        }

        return myJewels;
    }
}
