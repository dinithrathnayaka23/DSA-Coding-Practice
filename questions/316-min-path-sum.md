# 316. Minimum Path Sum

**Question:** Find the path of minimum sum from top-left to bottom-right moving right or down.

**Answer:** Accumulate the cheaper of the top and left neighbors into each cell.

```java
for (int r = 0; r < m; r++)
    for (int c = 0; c < n; c++) {
        if (r == 0 && c == 0) continue;
        int up = r > 0 ? grid[r - 1][c] : Integer.MAX_VALUE;
        int left = c > 0 ? grid[r][c - 1] : Integer.MAX_VALUE;
        grid[r][c] += Math.min(up, left);
    }
return grid[m - 1][n - 1];
```

**Complexity:** O(m · n) time, O(1) extra space.
