package dsa1_recap_quetions_;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // TC: O(n), SC: O(1)
        int profit = 0;
        int n = prices.length;
        int buy = prices[0];
        for (int i = 1; i < n; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            int currProfit = prices[i] - buy;
            if (currProfit > profit) {
                profit = currProfit;
            }
        }
        return profit;
    }
}