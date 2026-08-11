# 073. Coin Change

**Question:** Find the fewest coins needed to make an amount, or `-1` if impossible.

**Answer:** Build the minimum number for every amount from zero upward.

```java
int[] dp = new int[amount + 1]; Arrays.fill(dp, amount + 1); dp[0] = 0;
for (int value = 1; value <= amount; value++)
    for (int coin : coins) if (coin <= value) dp[value] = Math.min(dp[value], dp[value - coin] + 1);
return dp[amount] > amount ? -1 : dp[amount];
```

**Complexity:** O(amount · numberOfCoins) time, O(amount) space.
