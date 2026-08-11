# 295. Count Smaller Numbers After Self

**Question:** For each value, count smaller values appearing to its right.

**Answer:** Coordinate-compress values and insert from right to left into a Fenwick tree.

```java
for (int i = nums.length - 1; i >= 0; i--) { int rank = compressedRank(nums[i]); answer[i] = tree.sum(rank - 1); tree.add(rank, 1); }
```

**Complexity:** O(n log n) time, O(n) space.
