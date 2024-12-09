package medium.coin_change;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        return minCoins(coins, amount);
    }

    private int minCoins(int[] coins, int remaining) {
        if (remaining == 0) return 0;
        if (remaining < 0) return -1;

        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = minCoins(coins, remaining - coin);
            if (result >= 0) {
                min = Math.min(min, result + 1);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
