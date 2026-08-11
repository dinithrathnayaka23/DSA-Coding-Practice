# 079. Unique Paths

**Question:** Count paths from the top-left to bottom-right of an empty grid using only right and down moves.

**Answer:** Each cell receives paths from its top and left neighbors.

```java
int[] dp = new int[columns]; Arrays.fill(dp, 1);
for (int row = 1; row < rows; row++) for (int col = 1; col < columns; col++) dp[col] += dp[col - 1];
return dp[columns - 1];
```

**Complexity:** O(rows · columns) time, O(columns) space.
