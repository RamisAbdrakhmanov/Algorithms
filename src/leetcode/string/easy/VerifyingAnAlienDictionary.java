package leetcode.string.easy;

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        char[] al = order.toCharArray();

        for( int i = 1; i < words.length; i++){
            if(words[i].equals(words[i-1])){
                continue;
            }

            if(words[i-1].startsWith(words[i])){
                return false;
            }

            for (int j = 0; j < words[i-1].length() && j < words[i].length(); j++) {
                int i1 = searchIndex(al, words[i-1].charAt(j));
                int i2 = searchIndex(al, words[i].charAt(j));
                if( i2 < i1){
                    return false;
                } else if( i1 < i2){
                    break;
                }
            }


        }

        return true;
    }

    private int searchIndex(char[] chars, char c){
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i] == c){
                return i;
            }
        }
        return -1;
    }
}
