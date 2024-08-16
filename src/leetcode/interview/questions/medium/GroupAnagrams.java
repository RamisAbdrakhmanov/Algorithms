package leetcode.interview.questions.medium;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String str = new String(a);

            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }

            map.get(str).add(s);

        }
        return new ArrayList<>(map.values());
    }

 /*   public List<List<String>> groupAnagrams(String[] strs) {
        List<HashMap<Character, Integer>> maps = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();

        for (String s : strs) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }

            if (maps.contains(map)) {
                for (int i = 0; i < maps.size(); i++) {
                    if (maps.get(i).equals(map)) {
                        list.get(i).add(s);
                    }
                }
            } else {
                maps.add(map);
                List<String> str = new ArrayList<>();
                str.add(s);
                list.add(str);
            }
        }

        return list;
    }*/
}
