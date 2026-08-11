# 191. Floyd–Warshall

**Question:** Compute shortest paths between every pair of vertices.

**Answer:** Allow each vertex as an intermediate and improve `distance[i][j]` through it.

```java
for (int middle = 0; middle < n; middle++) for (int from = 0; from < n; from++) for (int to = 0; to < n; to++) distance[from][to] = Math.min(distance[from][to], distance[from][middle] + distance[middle][to]);
```

**Complexity:** O(V³) time, O(V²) space.
