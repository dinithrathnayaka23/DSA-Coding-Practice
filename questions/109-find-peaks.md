# 109. Find a Peak Element

**Question:** Find any index whose value is greater than its neighbors.

**Answer:** If the slope rises to the right, a peak exists there; binary-search the slope direction.

```java
int left = 0, right = nums.length - 1;
while (left < right) { int mid = (left + right) >>> 1;
    if (nums[mid] < nums[mid + 1]) left = mid + 1; else right = mid;
}
return left;
```

**Complexity:** O(log n) time, O(1) space.
