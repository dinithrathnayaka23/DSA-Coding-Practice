# 102. Maximum Product Subarray

**Question:** Find the largest product of a contiguous subarray.

**Answer:** Keep both the largest and smallest products ending at the current position because a negative can swap them.

```java
int high = nums[0], low = nums[0], answer = nums[0];
for (int i = 1; i < nums.length; i++) { int value = nums[i];
    if (value < 0) { int t = high; high = low; low = t; }
    high = Math.max(value, high * value); low = Math.min(value, low * value); answer = Math.max(answer, high);
}
return answer;
```

**Complexity:** O(n) time, O(1) space.
