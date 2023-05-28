package litcode.interview.questions.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int next = n;
        while( next!= 1 ){
            next = getNext(next);
            if(set.contains(next)){
                return false;
            } else {
                set.add(next);
            }
        }
        return true;

    }

    public int getNext(int numb){
        List<Integer> list = new ArrayList<>();
        while(numb > 0){
            list.add(numb%10);
            numb /=10;
        }
        int sum = 0;
        for (Integer i : list){
            sum += (i * i);
        }
        return sum;
    }
}
