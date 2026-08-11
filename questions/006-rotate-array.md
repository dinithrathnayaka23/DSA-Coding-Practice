# 006. Rotate Array

**Question:** Rotate an array to the right by `k` positions.

**Answer:** Reduce `k`, reverse the whole array, then reverse the two resulting sections.

```java
k %= nums.length;
reverse(nums, 0, nums.length - 1);
reverse(nums, 0, k - 1);
reverse(nums, k, nums.length - 1);
```

**Complexity:** O(n) time, O(1) space. `reverse` swaps inward from both ends.
