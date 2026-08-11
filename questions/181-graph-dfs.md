# 181. Graph Depth-First Search

**Question:** Visit every reachable vertex from a source.

**Answer:** Mark a vertex before recursively visiting each unvisited neighbor.

```java
void dfs(int vertex) { if (visited[vertex]) return; visited[vertex] = true; for (int next : graph[vertex]) dfs(next); }
```

**Complexity:** O(V + E) time, O(V) space.
