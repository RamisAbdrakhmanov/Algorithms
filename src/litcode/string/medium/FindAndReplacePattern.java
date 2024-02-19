package litcode.string.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String word: words){
            if(check(word, pattern))
                res.add(word);
        }
        return res;
    }

    boolean check(String w, String p){
        for(int i = 0; i < w.length(); i++){
            if(w.indexOf(w.charAt(i)) != p.indexOf(p.charAt(i)))
                return false;
        }
        return true;
    }
}
