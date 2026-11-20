# 434. Perfect Squares

**Question:** Find the fewest perfect squares that sum to n.

**Answer:** dp[i] is one plus the best dp[i - s*s] over all squares not exceeding i.

```java
int[] dp = new int[n + 1];
for (int i = 1; i <= n; i++) {
    dp[i] = Integer.MAX_VALUE;
    for (int s = 1; s * s <= i; s++)
        dp[i] = Math.min(dp[i], dp[i - s * s] + 1);
}
return dp[n];
```

**Complexity:** O(n √n) time, O(n) space.
