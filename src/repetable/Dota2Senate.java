package repetable;/*
package litcode.LeetCode75.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dota2Senate {
    public static void main(String[] args) {
        predictPartyVictory("RRDDDRDDDRD");
    }
    public static String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        char[] chars = senate.toCharArray();
        for (int i = 0; i < chars.length; i++) {
          if(chars[i] == 'R') {
              r.offer(i);
          }
          else {
              d.offer(i);
          }
        }

        while (!r.isEmpty() && !d.isEmpty()){
            int radiant = r.poll();
            int dire = d.poll();
            if(radiant<dire){
                r.offer(senate.length()+radiant);
            } else {
                d.offer(senate.length()+dire);
            }
        }

        return r.isEmpty() ? "DIRE" : "RADIANT";
    }
}*/
