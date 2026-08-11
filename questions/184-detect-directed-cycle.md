# 184. Detect Cycle in a Directed Graph

**Question:** Determine whether a directed graph contains a cycle.

**Answer:** DFS uses three states: unvisited, active in the recursion path, and finished.

```java
boolean visit(int v) { state[v] = 1; for (int next : graph[v]) { if (state[next] == 1) return true; if (state[next] == 0 && visit(next)) return true; } state[v] = 2; return false; }
```

**Complexity:** O(V + E) time, O(V) space.
