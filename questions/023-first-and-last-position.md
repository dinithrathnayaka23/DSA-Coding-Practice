# 023. First and Last Position

**Question:** Return the first and last index of a target in a sorted array.

**Answer:** Run binary search twice, choosing the leftmost match once and the rightmost match once.

```java
int first = lowerBound(nums, target);
int after = upperBound(nums, target);
return first == after ? new int[]{-1, -1} : new int[]{first, after - 1};
```

**Complexity:** O(log n) time, O(1) space. `lowerBound` finds the first index with value at least target.
