package leetcode.two_pointers.easy;

public class CheckIfWordOccursAsPrefix {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
