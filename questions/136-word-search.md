# 136. Word Search

**Question:** Determine whether a word can be traced through adjacent unused grid cells.

**Answer:** DFS from each matching cell, marking a cell temporarily during the path.

```java
boolean dfs(int r, int c, int index) { if (index == word.length()) return true; if (outside(r, c) || board[r][c] != word.charAt(index)) return false;
    board[r][c] = '#'; boolean found = dfs(r + 1, c, index + 1) || dfs(r - 1, c, index + 1) || dfs(r, c + 1, index + 1) || dfs(r, c - 1, index + 1); board[r][c] = word.charAt(index); return found;
}
```

**Complexity:** O(rows · columns · 4^L) worst case, O(L) recursion space.
