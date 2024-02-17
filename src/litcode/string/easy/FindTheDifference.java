package litcode.string.easy;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {

        int[] ans = new int[26];
        for(int i = 0; i < t.length(); i++){
            ans[t.charAt(i) - 'a'] +=1;
        }
        for(int i = 0; i < s.length(); i++){
            ans[t.charAt(i) - 'a'] -=1;
        }

        for(int i = 0; i<ans.length; i++){
            if(ans[i] != 0){
                return (char) (i+'a');
            }
        }

        return 1;
    }


}
