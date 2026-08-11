# 227. Partition Array for Maximum Sum

**Question:** Partition an array into groups of length at most `k`, replacing each group by its maximum, to maximize the sum.

**Answer:** DP tries each possible final group length ending at every position.

```java
int[] dp = new int[nums.length + 1]; for (int end = 1; end <= nums.length; end++) { int maximum = 0; for (int length = 1; length <= k && length <= end; length++) { maximum = Math.max(maximum, nums[end - length]); dp[end] = Math.max(dp[end], dp[end - length] + maximum * length); } } return dp[nums.length];
```

**Complexity:** O(nk) time, O(n) space.
