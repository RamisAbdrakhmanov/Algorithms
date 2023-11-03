package litcode.LeetCode75.HashMapSet;

import java.util.HashSet;
import java.util.Set;

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
