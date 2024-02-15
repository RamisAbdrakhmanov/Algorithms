package yandex.summer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutocompleteOnMinimals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] qn = br.readLine().split(" ");
        String[] dictionary = new String[Integer.parseInt(qn[0])];
        for (int i = 0; i < dictionary.length; i++) {

            dictionary[i] = br.readLine();
        }

        int ans = Integer.parseInt(qn[1]);


        while (ans-- > 0) {
            String[] prefix = br.readLine().split(" ");
            System.out.println(binarySearch(dictionary, prefix[1], Integer.parseInt(prefix[0])));
        }
        br.close();
    }

    private static int binarySearch(String[] dictionary, String prefix, int poz) {
        int l = 0;
        int r = dictionary.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (dictionary[mid].startsWith(prefix)) {
                if (mid == 0 || !dictionary[mid - 1].startsWith(prefix)) {
                    if (mid + poz - 1 < dictionary.length && dictionary[mid + poz - 1].startsWith(prefix)) {
                        return mid + poz;
                    } else {
                        return -1;
                    }
                } else {
                    r = mid - 1;
                }
            }

            for (int i = 0; i < prefix.length(); i++) {

                if (i == dictionary[mid].length()) {
                    l = mid + 1;
                    break;
                }
                if (prefix.charAt(i) < dictionary[mid].charAt(i)) {
                    r = mid - 1;
                    break;
                }
                if (prefix.charAt(i) > dictionary[mid].charAt(i)) {
                    l = mid + 1;
                    break;
                }
            }

        }
        return -1;
    }
}
