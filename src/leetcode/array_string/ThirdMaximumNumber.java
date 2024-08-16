package leetcode.array_string;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer thirdMax = null;
        Integer secondMax = null;
        Integer max = null;
        for (int num : nums) {

            if ((max == null || num > max)) {
                Integer temp = max;
                max = num;
                Integer temp2 = secondMax;
                secondMax = temp;
                thirdMax = temp2;
            } else if ((secondMax == null || num > secondMax) && max != num) {
                Integer temp = secondMax;
                secondMax = num;
                thirdMax = temp;
            } else if ((thirdMax == null || num > thirdMax) && max != num && secondMax != num) {
                thirdMax = num;
            }
        }
        if (thirdMax == null) {
            return max;
        } else {
            return thirdMax;
        }
    }

    /*public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num:nums){
            if (num> max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num>secondMax && num<max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num>thirdMax && num<secondMax) {
                thirdMax = num;
            }
        }
        return (thirdMax==Long.MIN_VALUE) ? (int)max : (int)thirdMax;
    }*/
}
