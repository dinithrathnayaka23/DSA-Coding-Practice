# 171. N-Queens

**Question:** Place `n` queens on an `n × n` board so none attack another.

**Answer:** Backtrack row by row while tracking occupied columns and diagonals.

```java
void place(int row) { if (row == n) { answer.add(copy(board)); return; } for (int col = 0; col < n; col++) if (safe(row, col)) { board[row][col] = 'Q'; mark(row, col); place(row + 1); unmark(row, col); board[row][col] = '.'; } }
```

**Complexity:** O(n!) approximate search time, O(n) auxiliary state.
