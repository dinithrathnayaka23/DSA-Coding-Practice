# 202. Minimum Path Sum

**Question:** Find the minimum sum path from the top-left to bottom-right of a non-negative grid.

**Answer:** Each cell keeps its value plus the cheaper reachable predecessor.

```java
for (int r = 0; r < rows; r++) for (int c = 0; c < columns; c++) if (r != 0 || c != 0) grid[r][c] += Math.min(r == 0 ? INF : grid[r - 1][c], c == 0 ? INF : grid[r][c - 1]);
return grid[rows - 1][columns - 1];
```

**Complexity:** O(rows · columns) time, O(1) extra space.
