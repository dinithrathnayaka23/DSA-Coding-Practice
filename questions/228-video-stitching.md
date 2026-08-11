# 228. Video Stitching

**Question:** Cover a target interval with the fewest video clips.

**Answer:** Greedily extend the reachable end using every clip that starts before the current reach.

```java
Arrays.sort(clips, Comparator.comparingInt(a -> a[0])); int used = 0, index = 0, reach = 0, next = 0; while (reach < target) { while (index < clips.length && clips[index][0] <= reach) next = Math.max(next, clips[index++][1]); if (next == reach) return -1; reach = next; used++; } return used;
```

**Complexity:** O(n log n) time, O(1) extra space.
