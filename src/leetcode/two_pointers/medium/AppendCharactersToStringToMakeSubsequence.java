package leetcode.two_pointers.medium;

public class AppendCharactersToStringToMakeSubsequence {
    public int appendCharacters(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        int iterator = 0;


        for (char c : first) {
            if (c == second[iterator]) {
                iterator++;
            }

            if (iterator == second.length) {
                return 0;
            }
        }


        return second.length - iterator;
    }
}
