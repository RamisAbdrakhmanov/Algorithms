package litcode.two_pointers.easy;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;

        while (l < r) {
            if (Character.isAlphabetic(chars[l]) && Character.isAlphabetic(chars[r])) {
                swap(chars, l++, r--);
            } else if (!Character.isAlphabetic(chars[l])) {
                l++;
            } else {
                r--;
            }
        }

        return new String(chars);
    }

    public void swap(char[] arr, int l, int r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
