# 209. Coin Change Combinations

**Question:** Count combinations of unlimited coins that form an amount, ignoring order.

**Answer:** Process each coin outermost so each combination is counted once.

```java
int[] dp = new int[amount + 1]; dp[0] = 1;
for (int coin : coins) for (int value = coin; value <= amount; value++) dp[value] += dp[value - coin];
return dp[amount];
```

**Complexity:** O(coins · amount) time, O(amount) space.
