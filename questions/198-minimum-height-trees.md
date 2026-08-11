# 198. Minimum Height Trees

**Question:** Find all roots that produce minimum-height trees in an undirected tree.

**Answer:** Repeatedly remove current leaves until one or two central vertices remain.

```java
while (remaining > 2) { int size = leaves.size(); remaining -= size; while (size-- > 0) for (int next : graph[leaves.poll()]) if (--degree[next] == 1) leaves.offer(next); }
return new ArrayList<>(leaves);
```

**Complexity:** O(V + E) time, O(V) space.
