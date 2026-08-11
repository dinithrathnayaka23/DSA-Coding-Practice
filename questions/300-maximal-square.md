# 300. Maximal Square

**Question:** Find the area of the largest all-ones square in a binary matrix.

**Answer:** A cell's square side is one plus the minimum of its top, left, and top-left neighbors.

```java
int[] dp = new int[columns + 1]; int best = 0, diagonal = 0; for (int r = 1; r <= rows; r++) { diagonal = 0; for (int c = 1; c <= columns; c++) { int above = dp[c]; dp[c] = matrix[r - 1][c - 1] == '1' ? 1 + Math.min(diagonal, Math.min(dp[c], dp[c - 1])) : 0; best = Math.max(best, dp[c]); diagonal = above; } } return best * best;
```

**Complexity:** O(rows · columns) time, O(columns) space.
