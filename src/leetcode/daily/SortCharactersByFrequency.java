package leetcode.daily;

public class SortCharactersByFrequency {
    public static void main(String[] args) {


        char a = 'z';
        System.out.println(frequencySort("asdasdasddasasdasddas"));
    }

    public static String frequencySort(String s) {
        if (s.isEmpty()) {
            return "";
        }

        char[] chars = s.toCharArray();
        int[] arr = new int[128];

        for (char c : chars) {
            arr[c]++;
        }

        char[] ans = new char[chars.length];
        int iterator = 0;

        int max = findNextMax(arr, Integer.MAX_VALUE);

        while (max > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    int count = max;
                    while (count-- > 0) {
                        ans[iterator++] = (char) i;
                    }
                }
            }

            max = findNextMax(arr, max);
        }

        return new String(ans);
    }

    private static int findNextMax(int[] arr, int prevMax) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] && prevMax > arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
