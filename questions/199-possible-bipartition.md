# 199. Possible Bipartition

**Question:** Split people into two groups so no disliked pair is together.

**Answer:** Build the dislike graph and two-color each component.

```java
for (int person = 1; person <= n; person++) if (color[person] == 0) { color[person] = 1; queue.offer(person); while (!queue.isEmpty()) { int current = queue.poll(); for (int next : graph[current]) { if (color[next] == 0) { color[next] = -color[current]; queue.offer(next); } else if (color[next] == color[current]) return false; } } }
return true;
```

**Complexity:** O(V + E) time, O(V + E) space.
