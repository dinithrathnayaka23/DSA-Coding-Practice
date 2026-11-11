# 356. Set Matrix Zeroes

**Question:** If a matrix cell is 0, set its entire row and column to 0 in place.

**Answer:** Record which rows and columns contain a zero, then clear them in a second pass.

```java
boolean[] row = new boolean[m.length], col = new boolean[m[0].length];
for (int i = 0; i < m.length; i++)
    for (int j = 0; j < m[0].length; j++)
        if (m[i][j] == 0) { row[i] = true; col[j] = true; }
for (int i = 0; i < m.length; i++)
    for (int j = 0; j < m[0].length; j++)
        if (row[i] || col[j]) m[i][j] = 0;
```

**Complexity:** O(rows · columns) time, O(rows + columns) space.
