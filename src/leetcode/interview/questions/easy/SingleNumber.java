package leetcode.interview.questions.easy;

public class SingleNumber {
   /* public int singleNumber(int[] nums) {
        Set<Integer> once = new HashSet<>();
        Set<Integer> twice = new HashSet<>();
        for (int i : nums) {
            if(once.contains(i)){
                twice.add(i);
            }else {
                once.add(i);
            }
        }
        once.removeAll(twice);
        Optional<Integer> first = once.stream().findFirst();
        return first.get();
    }*/

    public int singleNumber(int[] nums){
        int numb = 0;
        for (int i: nums) {
            numb ^= i;
        }
        return numb;
    }
}
