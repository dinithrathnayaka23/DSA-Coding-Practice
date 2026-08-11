# 188. Bidirectional Word Ladder

**Question:** Improve shortest word transformation search.

**Answer:** Expand the smaller of two frontiers from the start and end words until they meet.

```java
while (!left.isEmpty() && !right.isEmpty()) { if (left.size() > right.size()) { Set<String> swap = left; left = right; right = swap; } Set<String> next = new HashSet<>(); for (String word : left) for (String candidate : neighbors(word)) { if (right.contains(candidate)) return distance + 1; if (seen.add(candidate)) next.add(candidate); } left = next; distance++; }
```

**Complexity:** O(N · L²) worst case, typically much less than one-way BFS.
