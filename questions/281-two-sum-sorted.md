# 281. Two Sum in Sorted Array

**Question:** Find two sorted-array values that sum to a target.

**Answer:** Move the left pointer upward when the sum is too small and the right pointer downward when too large.

```java
int left = 0, right = nums.length - 1; while (left < right) { int sum = nums[left] + nums[right]; if (sum == target) return new int[]{left, right}; if (sum < target) left++; else right--; } return new int[0];
```

**Complexity:** O(n) time, O(1) space.
