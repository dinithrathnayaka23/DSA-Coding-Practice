# 216. Maximum Sum Circular Subarray

**Question:** Find the maximum subarray sum when the array is circular.

**Answer:** The answer is either ordinary Kadane maximum or total sum minus the minimum subarray.

```java
int total = 0, maximum = kadane(nums, true), minimum = kadane(nums, false); for (int value : nums) total += value;
return maximum < 0 ? maximum : Math.max(maximum, total - minimum);
```

**Complexity:** O(n) time, O(1) space.
