# 069. Bipartite Graph

**Question:** Determine whether graph vertices can be split into two groups with no same-group edge.

**Answer:** Two-color each component with BFS; an edge joining equal colors proves failure.

```java
int[] color = new int[n];
for (int start = 0; start < n; start++) if (color[start] == 0) {
    Queue<Integer> queue = new ArrayDeque<>(); queue.offer(start); color[start] = 1;
    while (!queue.isEmpty()) { int current = queue.poll(); for (int next : graph[current]) {
        if (color[next] == 0) { color[next] = -color[current]; queue.offer(next); }
        else if (color[next] == color[current]) return false;
    } }
}
return true;
```

**Complexity:** O(V + E) time, O(V) space.
