# 290. Minimum Interval to Include Each Query

**Question:** For each query point, find the smallest interval containing it.

**Answer:** Sort intervals and queries, adding eligible intervals to a min-heap by length.

```java
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); Integer[] order = sortedQueryIndices(queries); for (int index : order) { int query = queries[index]; while (pointer < intervals.length && intervals[pointer][0] <= query) heap.offer(intervals[pointer++]); while (!heap.isEmpty() && heap.peek()[1] < query) heap.poll(); answer[index] = heap.isEmpty() ? -1 : heap.peek()[1] - heap.peek()[0] + 1; }
```

**Complexity:** O((n + q) log n) time, O(n + q) space.
