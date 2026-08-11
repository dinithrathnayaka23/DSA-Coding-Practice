# 178. Maze Path

**Question:** Determine whether a ball can reach a destination while rolling until it hits a wall.

**Answer:** BFS over stopping positions, rolling in each direction before visiting a new stop.

```java
Queue<int[]> queue = new ArrayDeque<>(); queue.offer(start); seen[start[0]][start[1]] = true;
while (!queue.isEmpty()) { int[] point = queue.poll(); for (int[] d : directions) { int r = point[0], c = point[1]; while (open(r + d[0], c + d[1])) { r += d[0]; c += d[1]; } if (!seen[r][c]) { seen[r][c] = true; queue.offer(new int[]{r, c}); } } }
return seen[destination[0]][destination[1]];
```

**Complexity:** O(rows · columns · max(rows, columns)) time, O(rows · columns) space.
