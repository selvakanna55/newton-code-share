package greedy;
// https://leetcode.com/problems/coin-change/

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int ans = 0;
        int n = coins.length;
        for (int i = n - 1; i >= 0; i--) {
            if (amount >= coins[i]) {
                ans = ans + amount / coins[i];
                amount = amount % coins[i];
            }
        }
        if (amount == 0) return ans;
        return -1; //change cannot be given
    }
}
