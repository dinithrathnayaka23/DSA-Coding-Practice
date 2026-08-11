# 024. Search a 2D Matrix

**Question:** Search a matrix whose rows are sorted and whose first value is larger than the previous row's last value.

**Answer:** View the matrix as one sorted array and map a flat index back to row and column.

```java
int rows = matrix.length, cols = matrix[0].length, left = 0, right = rows * cols - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    int value = matrix[mid / cols][mid % cols];
    if (value == target) return true;
    if (value < target) left = mid + 1; else right = mid - 1;
}
return false;
```

**Complexity:** O(log(rows · columns)) time, O(1) space.
