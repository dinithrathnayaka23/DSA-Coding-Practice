# 342. Rotting Oranges

**Question:** Find the minutes until all fresh oranges rot, or -1 if some never do.

**Answer:** Multi-source BFS from every rotten orange, counting levels.

```java
Queue<int[]> q = new LinkedList<>();
int fresh = 0, minutes = 0;
for (int r = 0; r < g.length; r++)
    for (int c = 0; c < g[0].length; c++) {
        if (g[r][c] == 2) q.add(new int[]{r, c});
        else if (g[r][c] == 1) fresh++;
    }
int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
while (!q.isEmpty() && fresh > 0) {
    minutes++;
    for (int i = q.size(); i > 0; i--) {
        int[] cur = q.poll();
        for (int[] d : dirs) {
            int nr = cur[0] + d[0], nc = cur[1] + d[1];
            if (nr >= 0 && nc >= 0 && nr < g.length && nc < g[0].length && g[nr][nc] == 1) {
                g[nr][nc] = 2; fresh--; q.add(new int[]{nr, nc});
            }
        }
    }
}
return fresh == 0 ? minutes : -1;
```

**Complexity:** O(rows · columns) time and space.
