/*
package litcode.LeetCode75.HashMapSet;

import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        closeStrings("abc","cab");
    }

    */
/*public static boolean closeStrings(String word1, String word2) {
        if(word2.length() != word1.length()){
            return false;
        }
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (char c : w1){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for (char c : w2){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }

        List<Integer> list1 = new ArrayList<>(map1.values());
        List<Integer> list2 = new ArrayList<>(map2.values());
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }*//*


    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int word1Map[] = new int[26];
        int word2Map[] = new int[26];
        for (char c : word1.toCharArray()) {
            word1Map[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            word2Map[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((word1Map[i] == 0 && word2Map[i] > 0) ||
                    (word2Map[i] == 0 && word1Map[i] > 0)) {
                return false;
            }
        }
        Arrays.sort(word1Map);
        Arrays.sort(word2Map);
        return Arrays.equals(word1Map, word2Map);

    }
}
*/
