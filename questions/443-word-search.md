# 443. Word Search

**Question:** Decide whether a word can be traced through adjacent cells of a grid without reusing a cell.

**Answer:** DFS from each cell, marking visited cells temporarily and restoring on backtrack.

```java
boolean dfs(char[][] b, String w, int i, int r, int c) {
    if (i == w.length()) return true;
    if (r < 0 || c < 0 || r >= b.length || c >= b[0].length || b[r][c] != w.charAt(i)) return false;
    char t = b[r][c];
    b[r][c] = '#';
    boolean ok = dfs(b, w, i + 1, r + 1, c) || dfs(b, w, i + 1, r - 1, c)
              || dfs(b, w, i + 1, r, c + 1) || dfs(b, w, i + 1, r, c - 1);
    b[r][c] = t;
    return ok;
}
```

**Complexity:** O(m · n · 3^L) time, O(L) recursion space.
