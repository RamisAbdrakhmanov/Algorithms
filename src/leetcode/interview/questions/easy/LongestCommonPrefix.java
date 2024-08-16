package leetcode.interview.questions.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] srrs = {"flower","flow","flight"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(srrs));
    }
   /* public String longestCommonPrefix(String[] strs) {
        String answer = "";
        HashMap<String, Integer> countPrefix = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            for (int j = 0; j < word.length(); j++) {
                String prefix = word.substring(0, j + 1);
                if (countPrefix.containsKey(prefix)) {
                    countPrefix.put(prefix, countPrefix.get(prefix) + 1);
                } else {
                    countPrefix.put(prefix, 1);
                }
            }
        }
        for (Map.Entry<String,Integer> entry: countPrefix.entrySet()) {
            if(entry.getValue() == strs.length){
                if(entry.getKey().length() > answer.length()){
                    answer = entry.getKey();
                }
            }
        }
        return answer;
    }*/
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String answer = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(answer)){
                answer = answer.substring(0, answer.length()-1);
            }
        }
        return answer;
    }
}
