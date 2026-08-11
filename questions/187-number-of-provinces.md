# 187. Number of Provinces

**Question:** Count groups of mutually connected cities represented by an adjacency matrix.

**Answer:** DFS from each unseen city and mark every city reachable in the matrix.

```java
void visit(int city) { seen[city] = true; for (int next = 0; next < isConnected.length; next++) if (isConnected[city][next] == 1 && !seen[next]) visit(next); }
```

**Complexity:** O(n²) time, O(n) space.
