# 186. Connected Components

**Question:** Count connected components in an undirected graph.

**Answer:** Start one DFS or BFS for every unvisited vertex.

```java
int components = 0; for (int v = 0; v < n; v++) if (!seen[v]) { components++; dfs(v); }
return components;
```

**Complexity:** O(V + E) time, O(V) space.
