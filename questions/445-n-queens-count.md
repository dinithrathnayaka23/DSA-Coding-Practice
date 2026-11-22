# 445. N-Queens II

**Question:** Count the ways to place n queens on an n x n board so none attack each other.

**Answer:** Backtrack row by row, tracking used columns and both diagonals.

```java
int count = 0;
void place(int r, int n, boolean[] col, boolean[] d1, boolean[] d2) {
    if (r == n) { count++; return; }
    for (int c = 0; c < n; c++) {
        if (col[c] || d1[r + c] || d2[r - c + n - 1]) continue;
        col[c] = d1[r + c] = d2[r - c + n - 1] = true;
        place(r + 1, n, col, d1, d2);
        col[c] = d1[r + c] = d2[r - c + n - 1] = false;
    }
}
```

**Complexity:** O(n!) time, O(n) space.
