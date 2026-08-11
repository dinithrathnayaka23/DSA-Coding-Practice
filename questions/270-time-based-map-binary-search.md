# 270. Time-Indexed Map

**Question:** Return the latest value for a key at or before a requested timestamp.

**Answer:** Keep sorted timestamp/value pairs and binary-search the rightmost valid timestamp.

```java
int left = 0, right = entries.size() - 1, answer = -1; while (left <= right) { int mid = (left + right) >>> 1; if (entries.get(mid).time() <= timestamp) { answer = mid; left = mid + 1; } else right = mid - 1; } return answer < 0 ? null : entries.get(answer).value();
```

**Complexity:** O(log n) query, O(n) space.
