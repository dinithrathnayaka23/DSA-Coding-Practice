# 379. Pacific Atlantic Water Flow

**Question:** Find cells from which water can flow to both the Pacific and Atlantic oceans.

**Answer:** DFS uphill from each ocean's border; the answer is the intersection.

```java
boolean[][] pac = new boolean[m][n], atl = new boolean[m][n];
for (int r = 0; r < m; r++) { dfs(h, pac, r, 0); dfs(h, atl, r, n - 1); }
for (int c = 0; c < n; c++) { dfs(h, pac, 0, c); dfs(h, atl, m - 1, c); }
// dfs moves to neighbors with height >= current and marks them
// result: cells where pac[r][c] && atl[r][c]
```

**Complexity:** O(m · n) time and space.
