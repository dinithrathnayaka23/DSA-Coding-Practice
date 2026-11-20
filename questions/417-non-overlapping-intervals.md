# 417. Non-overlapping Intervals

**Question:** Find the minimum number of intervals to remove so the rest do not overlap.

**Answer:** Sort by end; greedily keep each interval that starts at or after the last kept end.

```java
Arrays.sort(iv, (a, b) -> Integer.compare(a[1], b[1]));
int end = Integer.MIN_VALUE, removed = 0;
for (int[] x : iv) {
    if (x[0] >= end) end = x[1];
    else removed++;
}
return removed;
```

**Complexity:** O(n log n) time, O(1) extra space.
