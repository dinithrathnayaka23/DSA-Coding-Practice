# 168. Kth Smallest in a Sorted Matrix

**Question:** Find the kth smallest value in a matrix sorted by rows and columns.

**Answer:** Binary-search the value range and count entries less than or equal to a midpoint.

```java
int low = matrix[0][0], high = matrix[n - 1][n - 1]; while (low < high) { int mid = low + (high - low) / 2; if (countAtMost(matrix, mid) < k) low = mid + 1; else high = mid; } return low;
```

**Complexity:** O(n log valueRange) time, O(1) space.
