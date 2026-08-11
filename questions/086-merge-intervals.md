# 086. Merge Intervals

**Question:** Merge all overlapping intervals.

**Answer:** Sort by start time and extend the current interval while the next one overlaps it.

```java
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
for (int[] interval : intervals) {
    if (answer.isEmpty() || answer.get(answer.size() - 1)[1] < interval[0]) answer.add(interval.clone());
    else answer.get(answer.size() - 1)[1] = Math.max(answer.get(answer.size() - 1)[1], interval[1]);
}
```

**Complexity:** O(n log n) time, O(n) result space.
