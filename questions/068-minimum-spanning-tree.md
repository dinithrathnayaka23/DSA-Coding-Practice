# 068. Minimum Spanning Tree

**Question:** Connect all weighted undirected graph vertices with minimum total edge weight.

**Answer:** Kruskal's algorithm sorts edges and uses a disjoint-set union to accept edges joining different components.

```java
Arrays.sort(edges, Comparator.comparingInt(Edge::weight));
for (Edge edge : edges) if (union(edge.from(), edge.to())) { total += edge.weight(); chosen++; }
return chosen == vertices - 1 ? total : -1;
```

**Complexity:** O(E log E) time, near O(E) DSU space.
