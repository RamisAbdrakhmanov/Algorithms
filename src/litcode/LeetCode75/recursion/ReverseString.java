package litcode.LeetCode75.recursion;

public class ReverseString {
    public void reverseString(char[] s) {
     reverse(s,0);
    }
    public void reverse(char[]s, int poz){
        if(poz >= s.length/2){
            return;
        }

        char temp = s[poz];
        s[poz] = s[s.length-1-poz];
        s[s.length-1-poz] = temp;

        reverse(s,poz+1);
    }
}
