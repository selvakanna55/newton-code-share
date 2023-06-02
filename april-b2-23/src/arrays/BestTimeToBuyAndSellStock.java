package arrays;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int small = prices[0];
        int n = prices.length;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            int todayProfit = prices[i] - small;
            if (profit < todayProfit) {
                profit = todayProfit;
            }
            if (prices[i] < small) {
                small = prices[i];
            }
        }
        return profit;
    }
}