package yandex.summer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Autocomplete {
    // можно хранить вторую копию
    private static final HashMap<String, Integer> cache = new HashMap<>();
    private static List<Word> dictionaries;

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {

            String[] str = br.readLine().split(" ");
            int lengthDictionary = Integer.parseInt(str[0]);
            int outputCount = Integer.parseInt(str[1]);

            dictionaries = new ArrayList<>(lengthDictionary);

            int id = 0;

            int maxPopularityIndex = 0;

            while (id++ < lengthDictionary) {
                str = br.readLine().split(" ");

                String word = str[0];
                int popularity = Integer.parseInt(str[1]);

                dictionaries.add(new Word(word, popularity, id));

                if (dictionaries.get(maxPopularityIndex).popularity < popularity) {
                    maxPopularityIndex = id - 1;
                }

            }
            cache.put("", maxPopularityIndex + 1);

            dictionaries.sort(Comparator.comparing(w -> w.word));

            StringBuilder sb = new StringBuilder();

            Autocomplete autocomplete = new Autocomplete();

            while (outputCount-- > 0) {
                str = br.readLine().split(" ");
                if (str[0].equals("+")) {
                    sb.append(str[1]);
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }


                System.out.println(autocomplete.search(sb.toString()));
            }

        }
    }


    private int search(String str) {
        if (cache.containsKey(str)) {
            return cache.get(str);
        }

        int pointer = binarySearch(str);

        if (pointer == -1) {
            return pointer;
        }

        int maxIndex = searchMaxIndexForPrefix(str, pointer);

        cache.put(str, dictionaries.get(maxIndex).id);

        return dictionaries.get(maxIndex).id;
    }

    private int searchMaxIndexForPrefix(String str, int pointer) {
        int maxIndex = pointer;

        int l = pointer - 1;
        int r = pointer + 1;
        while (l >= 0 && dictionaries.get(l).word.startsWith(str)) {
            if (dictionaries.get(maxIndex).popularity < dictionaries.get(l).popularity) {
                maxIndex = l;
            }
            l--;
        }
        while (r < dictionaries.size() && dictionaries.get(r).word.startsWith(str)) {
            if (dictionaries.get(maxIndex).popularity < dictionaries.get(r).popularity) {
                maxIndex = r;
            }
            r++;
        }

        return maxIndex;
    }


    private int binarySearch(String str) {
        int l = 0;
        int r = dictionaries.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (dictionaries.get(mid).word.startsWith(str)) {
                return mid;
            } else if ((dictionaries.get(mid).word).compareTo(str) > 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}

class Word {
    String word;
    int popularity;
    int id;

    public Word(String word, int popularity, int id) {
        this.word = word;
        this.popularity = popularity;
        this.id = id;
    }

}