# 190. Bellman–Ford

**Question:** Find shortest paths when edges may be negative and detect negative cycles.

**Answer:** Relax every edge `V - 1` times, then perform one extra pass to detect an improvement.

```java
Arrays.fill(distance, Integer.MAX_VALUE); distance[source] = 0;
for (int pass = 1; pass < vertices; pass++) for (Edge edge : edges) if (distance[edge.from()] != Integer.MAX_VALUE) distance[edge.to()] = Math.min(distance[edge.to()], distance[edge.from()] + edge.weight());
```

**Complexity:** O(VE) time, O(V) space.
