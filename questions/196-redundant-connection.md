# 196. Redundant Connection

**Question:** Find an edge that creates a cycle in an almost-tree graph.

**Answer:** A disjoint-set union rejects the first edge whose endpoints already share a root.

```java
for (int[] edge : edges) if (!union(edge[0], edge[1])) return edge;
return new int[0];
```

**Complexity:** O(E · alpha(V)) time, O(V) space.
