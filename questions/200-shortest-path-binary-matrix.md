# 200. Shortest Path in a Binary Matrix

**Question:** Find the shortest eight-direction path through zero-valued cells.

**Answer:** BFS guarantees the first time the destination is reached is shortest.

```java
Queue<Cell> queue = new ArrayDeque<>(); queue.offer(new Cell(0, 0, 1)); grid[0][0] = 1;
while (!queue.isEmpty()) { Cell current = queue.poll(); if (current.row() == n - 1 && current.col() == n - 1) return current.distance(); for (int[] d : eightDirections) if (open(current.row() + d[0], current.col() + d[1])) { grid[current.row() + d[0]][current.col() + d[1]] = 1; queue.offer(new Cell(current.row() + d[0], current.col() + d[1], current.distance() + 1)); } }
return -1;
```

**Complexity:** O(n²) time, O(n²) space.
