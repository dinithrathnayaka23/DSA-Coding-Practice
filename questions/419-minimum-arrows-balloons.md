# 419. Minimum Number of Arrows to Burst Balloons

**Question:** Find the fewest arrows needed to burst all balloons given as horizontal intervals.

**Answer:** Sort by end; shoot at an end and skip every balloon that starts at or before it.

```java
Arrays.sort(p, (a, b) -> Integer.compare(a[1], b[1]));
int arrows = 1;
int end = p[0][1];
for (int i = 1; i < p.length; i++)
    if (p[i][0] > end) { arrows++; end = p[i][1]; }
return arrows;
```

**Complexity:** O(n log n) time, O(1) extra space.
