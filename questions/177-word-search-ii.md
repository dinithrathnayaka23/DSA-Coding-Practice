# 177. Word Search II

**Question:** Find all dictionary words present in a character grid.

**Answer:** Build a trie of words and DFS the board, stopping paths that do not match a trie prefix.

```java
void search(int r, int c, TrieNode node) { if (outside(r, c) || board[r][c] == '#') return; node = node.child[board[r][c] - 'a']; if (node == null) return; if (node.word != null) answer.add(node.word); char saved = board[r][c]; board[r][c] = '#'; for (int[] direction : directions) search(r + direction[0], c + direction[1], node); board[r][c] = saved; }
```

**Complexity:** O(rows · columns · 4^L) worst case, plus trie space.
