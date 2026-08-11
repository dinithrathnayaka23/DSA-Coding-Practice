# 061. Number of Islands

**Question:** Count connected groups of land cells in a grid of `'1'` and `'0'`.

**Answer:** Whenever unvisited land is found, flood-fill it and count one island.

```java
for (int r = 0; r < grid.length; r++) for (int c = 0; c < grid[0].length; c++)
    if (grid[r][c] == '1') { islands++; flood(grid, r, c); }
void flood(char[][] g, int r, int c) {
    if (r < 0 || c < 0 || r == g.length || c == g[0].length || g[r][c] != '1') return;
    g[r][c] = '0'; flood(g, r + 1, c); flood(g, r - 1, c); flood(g, r, c + 1); flood(g, r, c - 1);
}
```

**Complexity:** O(rows · columns) time, O(rows · columns) worst-case recursion space.
