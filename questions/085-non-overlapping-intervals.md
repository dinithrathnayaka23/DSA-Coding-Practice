# 085. Non-overlapping Intervals

**Question:** Remove the fewest intervals so the remaining intervals do not overlap.

**Answer:** Sort by end time and keep intervals that start after the last kept end.

```java
Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
int kept = 0, end = Integer.MIN_VALUE;
for (int[] interval : intervals) if (interval[0] >= end) { kept++; end = interval[1]; }
return intervals.length - kept;
```

**Complexity:** O(n log n) time, O(1) extra space.
