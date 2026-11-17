# 412. Search Insert Position

**Question:** Return the index of a target in a sorted array, or where it would be inserted.

**Answer:** Binary search for the first index with value >= target.

```java
int lo = 0, hi = nums.length;
while (lo < hi) {
    int mid = lo + (hi - lo) / 2;
    if (nums[mid] < target) lo = mid + 1; else hi = mid;
}
return lo;
```

**Complexity:** O(log n) time, O(1) space.
