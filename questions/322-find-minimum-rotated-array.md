# 322. Find Minimum in Rotated Sorted Array

**Question:** Return the minimum of a rotated sorted array with distinct values.

**Answer:** Compare mid with the right end to decide which half holds the minimum.

```java
int lo = 0, hi = nums.length - 1;
while (lo < hi) {
    int mid = lo + (hi - lo) / 2;
    if (nums[mid] > nums[hi]) lo = mid + 1; else hi = mid;
}
return nums[lo];
```

**Complexity:** O(log n) time, O(1) space.
