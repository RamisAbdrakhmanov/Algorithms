package litcode.LeetCode75.array_string;

public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < min; i++) {
                sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        sb.append(word1.substring(min)).append(word2.substring(min));
        return String.valueOf(sb);
    }
}
