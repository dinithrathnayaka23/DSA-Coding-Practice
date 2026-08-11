# 282. Four Sum

**Question:** Return all unique quadruples whose sum equals a target.

**Answer:** Sort, fix two values, and solve the remaining pair with two pointers while skipping duplicates.

```java
Arrays.sort(nums); for (int a = 0; a < nums.length - 3; a++) for (int b = a + 1; b < nums.length - 2; b++) twoPointers(a, b, target - (long) nums[a] - nums[b]);
```

**Complexity:** O(n³) time, O(1) extra space excluding output.
