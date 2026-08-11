# 067. Network Delay Time

**Question:** Find how long it takes a signal from one node to reach every node in a weighted directed graph.

**Answer:** Dijkstra's algorithm repeatedly finalizes the closest unvisited node and relaxes outgoing edges.

```java
PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(State::distance));
pq.offer(new State(source, 0));
while (!pq.isEmpty()) {
    State current = pq.poll(); if (current.distance() != dist[current.node()]) continue;
    for (Edge edge : graph[current.node()]) if (dist[edge.to()] > current.distance() + edge.weight()) {
        dist[edge.to()] = current.distance() + edge.weight(); pq.offer(new State(edge.to(), dist[edge.to()]));
    }
}
```

**Complexity:** O((V + E) log V) time with a binary heap.
