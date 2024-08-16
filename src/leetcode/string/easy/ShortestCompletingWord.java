package leetcode.string.easy;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        new ShortestCompletingWord().shortestCompletingWord("1s3 456",
                new String[]{"looks","pest","stew","show"});
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] lp = new int[26];
        fillArrForLicense(lp, licensePlate);

        int minLength = Integer.MAX_VALUE;
        String min = null;
        for (String word : words) {
            int[] w = new int[26];
            fillArr(w, word);

            if (isCompleting(lp, w)) {
                if (word.length() < minLength) {
                    minLength = word.length();
                    min = word;
                }
            }

        }

        return min;
    }

    private boolean isCompleting(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                return false;
            }
        }
        return true;
    }

    private void fillArr(int[] arr, String s) {
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
    }

    private void fillArrForLicense(int[] arr, String s) {
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                arr[Character.toLowerCase(c) - 'a']++;
            }
        }
    }

}
