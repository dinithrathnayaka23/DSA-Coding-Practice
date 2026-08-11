# 212. Largest Plus Sign

**Question:** Find the largest order plus sign of ones in a grid containing mines.

**Answer:** For each cell, store the minimum arm length from four directional passes.

```java
for (int r = 0; r < n; r++) { int run = 0; for (int c = 0; c < n; c++) if (open(r, c)) arm[r][c] = Math.min(arm[r][c], ++run); else run = 0; }
```

**Complexity:** O(n²) time, O(n²) space.
