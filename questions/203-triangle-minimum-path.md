# 203. Triangle Minimum Path

**Question:** Find the minimum top-to-bottom path sum in a number triangle.

**Answer:** Bottom-up DP replaces each cell with its value plus the cheaper of its two children.

```java
for (int row = triangle.size() - 2; row >= 0; row--) for (int col = 0; col <= row; col++) triangle.get(row).set(col, triangle.get(row).get(col) + Math.min(triangle.get(row + 1).get(col), triangle.get(row + 1).get(col + 1)));
return triangle.get(0).get(0);
```

**Complexity:** O(n²) time, O(1) extra space if the triangle is mutable.
