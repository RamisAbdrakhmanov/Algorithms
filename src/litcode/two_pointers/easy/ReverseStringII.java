package litcode.two_pointers.easy;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += k*2) {
            int r= Math.min(i+k,chars.length)-1;
            reverse(chars, i, r);
        }

        return new String(chars);
    }

    private void reverse(char[] chars, int l, int r){
        while (l < r){
            swap(chars,l++,r--);
        }
    }

    private void swap(char[] chars, int l, int r){
        char temp = chars[l];
        chars[l] = chars[r];
        chars[r] = temp;
    }
}
