# 065. Rotting Oranges

**Question:** Find the minutes needed for all reachable fresh oranges to become rotten.

**Answer:** Multi-source BFS starts with every rotten orange and processes one time layer per minute.

```java
Queue<int[]> queue = new ArrayDeque<>();
for (each cell) if (grid[r][c] == 2) queue.offer(new int[]{r, c});
while (!queue.isEmpty()) {
    for (int size = queue.size(); size > 0; size--) spreadToFreshNeighbors(queue);
    minutes++;
}
return fresh == 0 ? minutes : -1;
```

**Complexity:** O(rows · columns) time, O(rows · columns) space.
