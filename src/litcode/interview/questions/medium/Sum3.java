package litcode.interview.questions.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum3 {
    public static void main(String[] args) {
        new Sum3().threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Map<Integer, Integer> plus = new HashMap<>();
        Map<Integer, Integer> minus = new HashMap<>();

        for (int i : nums) {
            if (i >= 0) {
                if (plus.containsKey(i)) {
                    plus.put(i, plus.get(i) + 1);
                } else {
                    plus.put(i, 1);
                }
            }else {
                if (minus.containsKey(i)) {
                    minus.put(i, minus.get(i) + 1);
                } else {
                    minus.put(i, 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : plus.entrySet()) {
            int sum = -entry.getKey();
            for (int i = 0; i >= sum; i--) {

                if (minus.containsKey(i) && minus.containsKey(sum - i)) {
                    if(i == sum - i){
                        if(minus.get(i) == 2){
                          list.add( List.of(minus.get(i),minus.get(i),entry.getKey()));
                        }
                    } else {
                        list.add( List.of(minus.get(i),minus.get(sum - i),entry.getKey()));
                    }
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : minus.entrySet()) {
            int sum = -entry.getKey();
            for (int i = 0; i <= sum; i++) {

                if (plus.containsKey(i) && plus.containsKey(sum - i)) {
                    if(i == sum - i){
                        if(minus.get(i) == 2){
                            list.add( List.of(plus.get(i),plus.get(i),entry.getKey()));
                        }
                    } else {
                        list.add( List.of(plus.get(i),plus.get(sum - i),entry.getKey()));
                    }
                }
            }
        }

        return list;


    }
}

