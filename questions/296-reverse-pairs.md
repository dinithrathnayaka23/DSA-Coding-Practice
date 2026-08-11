# 296. Reverse Pairs

**Question:** Count pairs `i < j` where `nums[i] > 2 * nums[j]`.

**Answer:** During merge sort, count valid cross-half pairs with a monotonic right pointer before merging.

```java
int right = mid + 1; for (int left = start; left <= mid; left++) { while (right <= end && (long) nums[left] > 2L * nums[right]) right++; count += right - mid - 1; } merge(nums, start, mid, end);
```

**Complexity:** O(n log n) time, O(n) space.
