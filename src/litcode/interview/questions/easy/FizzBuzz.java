package litcode.interview.questions.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static String BUZZ = "Buzz";
    static String FIZZ = "Fizz";
    static String FIZZ_BUZZ = "FizzBuzz";
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                list.add(FIZZ_BUZZ);
            } else if (i % 5 == 0){
                list.add(BUZZ);
            } else if(i % 3 == 0){
                list.add(FIZZ);
            } else {
                list.add(String.valueOf(i));
            }

        }
        return list;
    }
}
