# 064. Pacific Atlantic Water Flow

**Question:** Find cells from which water can reach both the Pacific and Atlantic edges.

**Answer:** Search inward from each ocean, moving only to equal or higher elevations, then intersect the reachable sets.

```java
for (int cell : pacificEdges) dfs(cell, pacific);
for (int cell : atlanticEdges) dfs(cell, atlantic);
for (int cell : allCells) if (pacific.contains(cell) && atlantic.contains(cell)) answer.add(cell);
```

**Complexity:** O(rows · columns) time, O(rows · columns) space.
