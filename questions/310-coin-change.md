# 310. Coin Change

**Question:** Find the fewest coins needed to make an amount, or -1 if impossible.

**Answer:** Bottom-up DP where dp[a] is the minimum coins for amount a.

```java
int[] dp = new int[amount + 1];
Arrays.fill(dp, amount + 1);
dp[0] = 0;
for (int a = 1; a <= amount; a++)
    for (int c : coins)
        if (c <= a) dp[a] = Math.min(dp[a], dp[a - c] + 1);
return dp[amount] > amount ? -1 : dp[amount];
```

**Complexity:** O(amount · coins) time, O(amount) space.
