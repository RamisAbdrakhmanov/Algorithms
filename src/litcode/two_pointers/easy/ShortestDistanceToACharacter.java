package litcode.two_pointers.easy;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int[] ans = new int[stringBuilder.length()];
        int iterator = 0;
        int prev = stringBuilder.indexOf(String.valueOf(c));
        while (stringBuilder.indexOf(String.valueOf(c)) != -1){
            int current = stringBuilder.indexOf(String.valueOf(c));
            for (int i = 0; i <= current; i++) {
                ans[iterator++] = Math.min(Math.abs(current-i),Math.abs(i+prev));
            }
            prev = 1;
            stringBuilder.delete(0, current+1);
        }

        for (int i = 0; i < stringBuilder.length(); i++) {
            ans[iterator++] = i+prev;
        }

        return ans;
    }
}
