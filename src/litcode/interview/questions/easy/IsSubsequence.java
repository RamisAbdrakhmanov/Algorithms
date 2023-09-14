package litcode.interview.questions.easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int slow = 0;
        int fast = 0;

        while (fast<t.length()){
            if(t.charAt(fast)==s.charAt(slow)){
                slow++;
            }
            fast++;

            if(slow == s.length()){
                return true;
            }
        }

        return false;
    }
}
