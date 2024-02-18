package litcode.string.easy;

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        Map<String, Integer> counts = new HashMap<>();

        for(String word : words){
            if(!ban.contains(word)){
                counts.put(word, counts.getOrDefault(word, 0)+1);
            }
        }

        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
