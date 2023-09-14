package tinkoff.automn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        String[] spl = "sheri".split("");
        int min = Integer.MAX_VALUE;
        for (String s :spl){
            if(map.containsKey(s)){
                if( min > map.get(s)){
                    min = map.get(s);
                }
            }
        }
        if(map.containsKey("f")){
            if( min > map.get("f")*2){
                min = map.get("f")*2;
            }
        }else {
            min = 0;
        }
        System.out.println(min);
    }
}
