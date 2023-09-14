package litcode.interview.questions.medium;

import java.util.Arrays;
import java.util.Collections;

public class H_Index {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count = 0;
        for (int i = citations.length-1; i >= 0; i--) {
            if(count+1>citations[i]){
                break;
            }
            count++;
        }
        return count;
    }
}
