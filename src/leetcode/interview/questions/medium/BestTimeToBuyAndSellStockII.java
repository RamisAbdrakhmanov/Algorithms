package leetcode.interview.questions.medium;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]) {
                sum += prices[i-1] - min;
                min = prices[i];
            }
        }
        if(min < prices[prices.length-1]){
            sum += prices[prices.length-1] - min;
        }
        return sum;
    }
}
