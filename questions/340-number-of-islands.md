# 340. Number of Islands

**Question:** Count groups of connected land cells ('1') in a grid.

**Answer:** Flood fill each unvisited land cell with DFS and count the starts.

```java
int count = 0;
for (int r = 0; r < g.length; r++)
    for (int c = 0; c < g[0].length; c++)
        if (g[r][c] == '1') { count++; sink(g, r, c); }
return count;

void sink(char[][] g, int r, int c) {
    if (r < 0 || c < 0 || r >= g.length || c >= g[0].length || g[r][c] != '1') return;
    g[r][c] = '0';
    sink(g, r + 1, c); sink(g, r - 1, c); sink(g, r, c + 1); sink(g, r, c - 1);
}
```

**Complexity:** O(rows · columns) time and recursion space.
