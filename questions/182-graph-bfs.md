# 182. Graph Breadth-First Search

**Question:** Visit graph vertices in increasing edge distance from a source.

**Answer:** Use a queue and mark vertices when enqueued so each enters once.

```java
Queue<Integer> queue = new ArrayDeque<>(); queue.offer(source); seen[source] = true;
while (!queue.isEmpty()) { int current = queue.poll(); for (int next : graph[current]) if (!seen[next]) { seen[next] = true; queue.offer(next); } }
```

**Complexity:** O(V + E) time, O(V) space.
