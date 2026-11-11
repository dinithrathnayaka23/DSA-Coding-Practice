# 354. Rotate Image

**Question:** Rotate an n x n matrix 90 degrees clockwise in place.

**Answer:** Transpose the matrix, then reverse each row.

```java
int n = m.length;
for (int i = 0; i < n; i++)
    for (int j = i + 1; j < n; j++) {
        int t = m[i][j]; m[i][j] = m[j][i]; m[j][i] = t;
    }
for (int[] row : m)
    for (int l = 0, r = n - 1; l < r; l++, r--) {
        int t = row[l]; row[l] = row[r]; row[r] = t;
    }
```

**Complexity:** O(n²) time, O(1) space.
