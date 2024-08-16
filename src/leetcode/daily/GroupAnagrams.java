package leetcode.daily;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();
        for (String str : strs) {

            List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[26]));
            for (int j = 0; j < str.length(); j++) {
                int poz = str.charAt(j) - 'a';
                if(list.get(poz) == null) {
                    list.set(poz,1);
                } else {
                    list.set(poz,list.get(poz)+1);
                }
            }
            if (!map.containsKey(list)) {
                map.put(list, new ArrayList<>());
            }

            map.get(list).add(str);
        }

        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<List<Integer>, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}
