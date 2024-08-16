package leetcode.string.easy;

public class RotateString {
    public static void main(String[] args) {
        new RotateString().rotateString("abcde","cdeab");
    }
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        StringBuilder sb = new StringBuilder(goal);
        sb.append(goal);
        int i = sb.indexOf(s);

        return i != -1;
    }
}
