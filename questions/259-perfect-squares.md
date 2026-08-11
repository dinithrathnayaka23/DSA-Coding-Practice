# 259. Perfect Squares

**Question:** Find the fewest perfect squares that sum to `n`.

**Answer:** Unbounded knapsack DP tries every square up to each amount.

```java
int[] dp = new int[n + 1]; Arrays.fill(dp, n + 1); dp[0] = 0; for (int value = 1; value <= n; value++) for (int square = 1; square * square <= value; square++) dp[value] = Math.min(dp[value], dp[value - square * square] + 1); return dp[n];
```

**Complexity:** O(n√n) time, O(n) space.
