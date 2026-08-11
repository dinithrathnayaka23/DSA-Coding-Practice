# 294. Kth Largest With Quickselect

**Question:** Find the kth largest value without sorting all values.

**Answer:** Partition around a pivot and recurse only into the side containing target rank.

```java
int targetIndex = nums.length - k, left = 0, right = nums.length - 1; while (left <= right) { int pivot = partition(nums, left, right); if (pivot == targetIndex) return nums[pivot]; if (pivot < targetIndex) left = pivot + 1; else right = pivot - 1; } throw new AssertionError();
```

**Complexity:** O(n) average time, O(1) extra space; O(n²) worst case.
