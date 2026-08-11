# 207. Burst Balloons

**Question:** Maximize coins earned by bursting balloons in an optimal order.

**Answer:** Choose the last balloon in each interval; its neighbors are known when it is burst.

```java
for (int length = 1; length <= n; length++) for (int left = 1; left + length - 1 <= n; left++) { int right = left + length - 1; for (int last = left; last <= right; last++) dp[left][right] = Math.max(dp[left][right], dp[left][last - 1] + values[left - 1] * values[last] * values[right + 1] + dp[last + 1][right]); }
return dp[1][n];
```

**Complexity:** O(n³) time, O(n²) space.
