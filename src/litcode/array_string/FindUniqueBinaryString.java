package litcode.array_string;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            stringBuilder.append(nums[i].charAt(i) == '0'? "1": "0");
        }

        return String.valueOf(stringBuilder);
    }
}
