# 063. Course Schedule

**Question:** Decide whether all courses can be completed given prerequisite pairs.

**Answer:** A directed cycle makes completion impossible; Kahn's algorithm removes zero-indegree courses.

```java
Queue<Integer> ready = new ArrayDeque<>();
for (int course = 0; course < n; course++) if (indegree[course] == 0) ready.offer(course);
int completed = 0;
while (!ready.isEmpty()) { int course = ready.poll(); completed++;
    for (int next : graph[course]) if (--indegree[next] == 0) ready.offer(next); }
return completed == n;
```

**Complexity:** O(V + E) time, O(V + E) space.
