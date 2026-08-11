# 194. Clone Graph Iteratively

**Question:** Clone a graph without recursion.

**Answer:** BFS creates each clone once and then copies its neighbors.

```java
Map<Node, Node> copies = new HashMap<>(); Queue<Node> queue = new ArrayDeque<>(); copies.put(start, new Node(start.value)); queue.offer(start);
while (!queue.isEmpty()) { Node original = queue.poll(); for (Node neighbor : original.neighbors) { copies.computeIfAbsent(neighbor, x -> { queue.offer(neighbor); return new Node(neighbor.value); }); copies.get(original).neighbors.add(copies.get(neighbor)); } }
```

**Complexity:** O(V + E) time, O(V) space.
