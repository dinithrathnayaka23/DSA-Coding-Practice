# 223. Minimum Arrows to Burst Balloons

**Question:** Find the fewest vertical arrows needed to burst intervals.

**Answer:** Sort by ending coordinate and shoot at the current end; start a new arrow only for a non-overlapping balloon.

```java
Arrays.sort(points, Comparator.comparingInt(p -> p[1])); int arrows = 0; long end = Long.MIN_VALUE; for (int[] point : points) if (point[0] > end) { arrows++; end = point[1]; } return arrows;
```

**Complexity:** O(n log n) time, O(1) extra space.
