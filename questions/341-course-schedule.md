# 341. Course Schedule

**Question:** Decide whether all courses can be finished given prerequisite pairs.

**Answer:** Kahn's topological sort: the schedule is possible if every node gets processed.

```java
int[] indeg = new int[n];
List<List<Integer>> adj = new ArrayList<>();
for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
for (int[] p : pre) { adj.get(p[1]).add(p[0]); indeg[p[0]]++; }
Deque<Integer> q = new ArrayDeque<>();
for (int i = 0; i < n; i++) if (indeg[i] == 0) q.add(i);
int done = 0;
while (!q.isEmpty()) {
    int u = q.poll(); done++;
    for (int v : adj.get(u)) if (--indeg[v] == 0) q.add(v);
}
return done == n;
```

**Complexity:** O(V + E) time and space.
