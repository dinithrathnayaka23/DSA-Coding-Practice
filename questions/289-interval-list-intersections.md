# 289. Interval List Intersections

**Question:** Return intersections of two sorted, disjoint interval lists.

**Answer:** The overlap is `[max(starts), min(ends)]`; advance the interval that ends first.

```java
while (i < first.length && j < second.length) { int start = Math.max(first[i][0], second[j][0]), end = Math.min(first[i][1], second[j][1]); if (start <= end) answer.add(new int[]{start, end}); if (first[i][1] < second[j][1]) i++; else j++; }
```

**Complexity:** O(n + m) time, O(1) extra space excluding output.
