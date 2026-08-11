# 201. Unique Paths With Obstacles

**Question:** Count paths through a grid while avoiding blocked cells.

**Answer:** Set blocked cells to zero and accumulate paths from above and left.

```java
long[] dp = new long[columns]; dp[0] = 1;
for (int[] row : grid) for (int c = 0; c < columns; c++) dp[c] = row[c] == 1 ? 0 : dp[c] + (c == 0 ? 0 : dp[c - 1]);
return dp[columns - 1];
```

**Complexity:** O(rows · columns) time, O(columns) space.
