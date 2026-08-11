# 185. Detect Cycle in an Undirected Graph

**Question:** Determine whether an undirected graph has a cycle.

**Answer:** During DFS, an already visited neighbor is a cycle unless it is the vertex's parent.

```java
boolean visit(int current, int parent) { seen[current] = true; for (int next : graph[current]) { if (!seen[next] && visit(next, current)) return true; if (seen[next] && next != parent) return true; } return false; }
```

**Complexity:** O(V + E) time, O(V) space.
