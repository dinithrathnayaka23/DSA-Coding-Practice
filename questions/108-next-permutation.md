# 108. Next Permutation

**Question:** Rearrange numbers into the lexicographically next greater permutation.

**Answer:** Find the rightmost ascent, swap it with the smallest larger suffix value, then reverse the suffix.

```java
int i = nums.length - 2; while (i >= 0 && nums[i] >= nums[i + 1]) i--;
if (i >= 0) { int j = nums.length - 1; while (nums[j] <= nums[i]) j--; swap(nums, i, j); }
reverse(nums, i + 1, nums.length - 1);
```

**Complexity:** O(n) time, O(1) space.
