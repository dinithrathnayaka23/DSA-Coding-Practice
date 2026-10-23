# 320. Binary Search

**Question:** Find the index of a target in a sorted array, or -1.

**Answer:** Halve the search window each step using a safe midpoint.

```java
int lo = 0, hi = nums.length - 1;
while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    if (nums[mid] == target) return mid;
    if (nums[mid] < target) lo = mid + 1; else hi = mid - 1;
}
return -1;
```

**Complexity:** O(log n) time, O(1) space.
