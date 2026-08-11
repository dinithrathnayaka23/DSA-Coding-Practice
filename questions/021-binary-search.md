# 021. Binary Search

**Question:** Find a target in a sorted array and return its index, or `-1`.

**Answer:** Repeatedly discard the half that cannot contain the target.

```java
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    if (nums[mid] < target) left = mid + 1; else right = mid - 1;
}
return -1;
```

**Complexity:** O(log n) time, O(1) space.
