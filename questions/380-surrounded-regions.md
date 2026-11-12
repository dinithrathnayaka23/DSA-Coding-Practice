# 380. Surrounded Regions

**Question:** Flip every 'O' region that is fully surrounded by 'X'.

**Answer:** Mark 'O' cells reachable from the border as safe, then flip the rest.

```java
for (int r = 0; r < m; r++) { mark(b, r, 0); mark(b, r, n - 1); }
for (int c = 0; c < n; c++) { mark(b, 0, c); mark(b, m - 1, c); }
for (int r = 0; r < m; r++)
    for (int c = 0; c < n; c++)
        b[r][c] = b[r][c] == 'S' ? 'O' : 'X';
// mark: DFS that turns border-connected 'O' into 'S'
```

**Complexity:** O(m · n) time and space.
