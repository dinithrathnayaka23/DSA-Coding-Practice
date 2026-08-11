# 211. Maximal Rectangle

**Question:** Find the largest all-ones rectangle in a binary matrix.

**Answer:** Convert each row into histogram heights and apply largest-rectangle-in-histogram.

```java
int[] heights = new int[columns]; for (char[] row : matrix) { for (int c = 0; c < columns; c++) heights[c] = row[c] == '1' ? heights[c] + 1 : 0; best = Math.max(best, largestHistogram(heights)); }
```

**Complexity:** O(rows · columns) time, O(columns) space.
