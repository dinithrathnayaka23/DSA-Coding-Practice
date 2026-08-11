# 193. Cheapest Flight Within K Stops

**Question:** Find the cheapest route using at most `k` stops.

**Answer:** Relax all edges for at most `k + 1` layers using a copied distance array.

```java
int[] distance = new int[n]; Arrays.fill(distance, INF); distance[source] = 0;
for (int step = 0; step <= k; step++) { int[] next = distance.clone(); for (Flight flight : flights) if (distance[flight.from()] != INF) next[flight.to()] = Math.min(next[flight.to()], distance[flight.from()] + flight.cost()); distance = next; }
return distance[destination] == INF ? -1 : distance[destination];
```

**Complexity:** O(kE) time, O(V) space.
