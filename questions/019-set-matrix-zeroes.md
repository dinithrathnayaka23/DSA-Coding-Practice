# 019. Set Matrix Zeroes

**Question:** If a matrix cell is zero, set its entire row and column to zero in place.

**Answer:** Use the first row and first column as marker storage, while remembering whether they originally contain zero.

```java
boolean firstRow = false, firstCol = false;
for (int c = 0; c < matrix[0].length; c++) if (matrix[0][c] == 0) firstRow = true;
for (int r = 0; r < matrix.length; r++) if (matrix[r][0] == 0) firstCol = true;
for (int r = 1; r < matrix.length; r++) for (int c = 1; c < matrix[0].length; c++)
    if (matrix[r][c] == 0) { matrix[r][0] = 0; matrix[0][c] = 0; }
```

**Complexity:** O(rows · columns) time, O(1) extra space.
