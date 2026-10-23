# 307. Maximum Subarray

**Question:** Find the contiguous subarray with the largest sum.

**Answer:** Kadane's algorithm: extend the current run or restart at the current element.

```java
int cur = nums[0], best = nums[0];
for (int i = 1; i < nums.length; i++) {
    cur = Math.max(nums[i], cur + nums[i]);
    best = Math.max(best, cur);
}
return best;
```

**Complexity:** O(n) time, O(1) space.
