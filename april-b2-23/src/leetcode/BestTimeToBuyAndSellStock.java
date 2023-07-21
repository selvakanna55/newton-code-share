package leetcode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int small = prices[0];
        for (int i = 0; i < n; i++) {
            if (small > prices[i]) { //find cheaper ever
                small = prices[i];
            }
            int currProfit = prices[i] - small; //sell today
            if (currProfit > profit) {
                profit = currProfit;
            }
        }
        return profit;
    }
}
//Output: 5