package leetcode.interview.questions.easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i : prices){
            if(min>i){
                min = i;
            }
            if(i - min > profit){
                profit = i - min;
            }
        }
        return profit;
    }
}
