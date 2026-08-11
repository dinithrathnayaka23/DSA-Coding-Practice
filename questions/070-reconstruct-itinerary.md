# 070. Reconstruct Itinerary

**Question:** Reconstruct the lexicographically smallest route using every airline ticket once.

**Answer:** Sort destinations in reverse order and perform Hierholzer's DFS, adding airports after exhausting outgoing edges.

```java
for (Ticket ticket : tickets) graph.computeIfAbsent(ticket.from(), x -> new PriorityQueue<>(Comparator.reverseOrder())).offer(ticket.to());
void visit(String airport) { while (graph.containsKey(airport) && !graph.get(airport).isEmpty()) visit(graph.get(airport).poll()); route.addFirst(airport); }
```

**Complexity:** O(E log E) time, O(V + E) space.
