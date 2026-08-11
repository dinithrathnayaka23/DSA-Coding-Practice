# 297. Count of Range Sum

**Question:** Count subarrays whose sums lie in `[lower, upper]`.

**Answer:** Prefix sums reduce the condition to counting earlier values in a range, handled by merge sort or an ordered structure.

```java
long[] prefix = prefixSums(nums); return count(prefix, 0, prefix.length - 1, lower, upper);
```

**Complexity:** O(n log n) time with divide-and-conquer, O(n) space.
