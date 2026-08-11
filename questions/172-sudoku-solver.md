# 172. Sudoku Solver

**Question:** Fill a partially completed 9×9 Sudoku board.

**Answer:** Choose an empty cell, try legal digits, and backtrack when a choice cannot lead to a solution.

```java
boolean solve() { Cell cell = nextEmpty(); if (cell == null) return true; for (int digit = 1; digit <= 9; digit++) if (valid(cell, digit)) { board[cell.row()][cell.col()] = digit; if (solve()) return true; board[cell.row()][cell.col()] = 0; } return false; }
```

**Complexity:** Exponential worst case, O(81) recursion/state space.
