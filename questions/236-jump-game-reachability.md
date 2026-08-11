# 236. Reachable End With Variable Jumps

**Question:** Determine whether an array can be reached when each index lists jump destinations.

**Answer:** BFS or a queue of reachable indices explores each index once.

```java
Queue<Integer> queue = new ArrayDeque<>(); queue.offer(0); seen[0] = true; while (!queue.isEmpty()) { int current = queue.poll(); for (int next : jumps[current]) if (!seen[next]) { seen[next] = true; queue.offer(next); } } return seen[n - 1];
```

**Complexity:** O(V + E) time, O(V) space.
