package litcode.stack;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c == '('){
                count++;
                max = Math.max(max, count);
            } else if(c == ')'){
                count--;
            }
        }

        return max;
    }
}
