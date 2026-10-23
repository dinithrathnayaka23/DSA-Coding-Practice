# 318. Merge Intervals

**Question:** Merge all overlapping intervals.

**Answer:** Sort by start and extend the last merged interval while the next one overlaps.

```java
Arrays.sort(iv, (a, b) -> a[0] - b[0]);
List<int[]> out = new ArrayList<>();
for (int[] cur : iv) {
    if (out.isEmpty() || out.get(out.size() - 1)[1] < cur[0]) out.add(cur);
    else out.get(out.size() - 1)[1] = Math.max(out.get(out.size() - 1)[1], cur[1]);
}
return out.toArray(new int[0][]);
```

**Complexity:** O(n log n) time, O(n) space.
