package litcode.two_pointers;

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        char[] di = s.toCharArray();
        int[] ans = new int[di.length + 1];

        int left = 0;
        int right = ans.length-1;

        for (int i = 0; i < di.length; i++) {
            if (di[i] == 'I') {
                ans[i] = left++;
            } else {
                ans[i] = right--;
            }
        }

        ans[ans.length - 1] = left;

        return ans;
    }
}
