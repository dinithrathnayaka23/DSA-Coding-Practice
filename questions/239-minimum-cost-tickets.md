# 239. Minimum Cost Tickets

**Question:** Minimize ticket cost to cover a list of travel days using 1-, 7-, or 30-day passes.

**Answer:** DP advances to the first uncovered day after each pass choice.

```java
for (int i = 1; i <= lastDay; i++) if (!travel[i]) dp[i] = dp[i - 1]; else dp[i] = Math.min(dp[i - 1] + one, Math.min(dp[Math.max(0, i - 7)] + seven, dp[Math.max(0, i - 30)] + thirty));
return dp[lastDay];
```

**Complexity:** O(lastDay) time, O(lastDay) space.
