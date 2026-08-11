# 106. Two-Dimensional Range Sum

**Question:** Answer rectangle-sum queries in a fixed matrix.

**Answer:** Build a summed-area table with an extra top row and left column.

```java
for (int r = 1; r <= rows; r++) for (int c = 1; c <= cols; c++)
    sum[r][c] = matrix[r - 1][c - 1] + sum[r - 1][c] + sum[r][c - 1] - sum[r - 1][c - 1];
int query(int r1, int c1, int r2, int c2) { return sum[r2 + 1][c2 + 1] - sum[r1][c2 + 1] - sum[r2 + 1][c1] + sum[r1][c1]; }
```

**Complexity:** O(rows · columns) preprocessing, O(1) per query.
