# 240. Minimum Deletions for a Mountain Array

**Question:** Remove the fewest values so the remaining array strictly rises then strictly falls.

**Answer:** Compute increasing subsequence lengths from the left and right and maximize a valid peak.

```java
for (int peak = 1; peak < n - 1; peak++) if (left[peak] > 1 && right[peak] > 1) best = Math.max(best, left[peak] + right[peak] - 1); return n - best;
```

**Complexity:** O(n log n) with binary-search LIS lengths, O(n) space.
