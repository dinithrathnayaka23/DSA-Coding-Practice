# 020. Spiral Matrix

**Question:** Return a matrix's values in clockwise spiral order.

**Answer:** Maintain top, bottom, left, and right boundaries and shrink one after each edge.

```java
while (top <= bottom && left <= right) {
    for (int c = left; c <= right; c++) answer.add(matrix[top][c]); top++;
    for (int r = top; r <= bottom; r++) answer.add(matrix[r][right]); right--;
    if (top <= bottom) for (int c = right; c >= left; c--) answer.add(matrix[bottom][c]); bottom--;
    if (left <= right) for (int r = bottom; r >= top; r--) answer.add(matrix[r][left]); left++;
}
```

**Complexity:** O(rows · columns) time, O(1) extra space excluding the result.
