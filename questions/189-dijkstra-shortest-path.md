# 189. Dijkstra Shortest Paths

**Question:** Find shortest paths from one source when all edge weights are non-negative.

**Answer:** Use a min-priority queue and ignore stale states whose distance is no longer optimal.

```java
PriorityQueue<State> queue = new PriorityQueue<>(Comparator.comparingInt(State::distance)); queue.offer(new State(source, 0));
while (!queue.isEmpty()) { State state = queue.poll(); if (state.distance() != distance[state.node()]) continue; for (Edge edge : graph[state.node()]) relax(state, edge, queue); }
```

**Complexity:** O((V + E) log V) time, O(V) distance space.
