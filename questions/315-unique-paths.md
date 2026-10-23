# 315. Unique Paths

**Question:** Count the paths from the top-left to the bottom-right of a grid moving only right or down.

**Answer:** Each cell's count is the sum of the cell above and the cell to the left; use one row.

```java
int[] dp = new int[n];
Arrays.fill(dp, 1);
for (int r = 1; r < m; r++)
    for (int c = 1; c < n; c++)
        dp[c] += dp[c - 1];
return dp[n - 1];
```

**Complexity:** O(m · n) time, O(n) space.
