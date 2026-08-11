# 291. Range Module

**Question:** Add, remove, and query half-open integer ranges.

**Answer:** Store disjoint sorted intervals and merge or split them during updates.

```java
void addRange(int left, int right) { mergeOverlaps(left, right); }
boolean queryRange(int left, int right) { Map.Entry<Integer, Integer> entry = ranges.floorEntry(left); return entry != null && entry.getValue() >= right; }
```

**Complexity:** O(log n + overlaps) per operation with a balanced map.
