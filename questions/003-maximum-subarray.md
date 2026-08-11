# 003. Maximum Subarray

**Question:** Find the largest sum of a non-empty contiguous subarray.

**Answer:** Kadane's algorithm either extends the current range or starts at the current value.

```java
int current = nums[0], best = nums[0];
for (int i = 1; i < nums.length; i++) {
    current = Math.max(nums[i], current + nums[i]);
    best = Math.max(best, current);
}
return best;
```

**Complexity:** O(n) time, O(1) space.
