# 183. Topological Sort

**Question:** Order vertices of a directed acyclic graph so every edge points forward.

**Answer:** Repeatedly remove zero-indegree vertices and decrease their neighbors' indegrees.

```java
Queue<Integer> ready = new ArrayDeque<>(); for (int v = 0; v < n; v++) if (indegree[v] == 0) ready.offer(v);
while (!ready.isEmpty()) { int v = ready.poll(); order.add(v); for (int next : graph[v]) if (--indegree[next] == 0) ready.offer(next); }
return order.size() == n ? order : List.of();
```

**Complexity:** O(V + E) time, O(V) space.
