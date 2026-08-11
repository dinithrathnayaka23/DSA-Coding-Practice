# 208. Matrix Chain Multiplication

**Question:** Find the minimum scalar multiplications needed to multiply a matrix chain.

**Answer:** Interval DP tries every split point and combines left cost, right cost, and split cost.

```java
for (int length = 2; length < matrices; length++) for (int left = 1; left + length - 1 < matrices; left++) { int right = left + length - 1; for (int split = left; split < right; split++) dp[left][right] = Math.min(dp[left][right], dp[left][split] + dp[split + 1][right] + dimensions[left - 1] * dimensions[split] * dimensions[right]); }
return dp[1][matrices - 1];
```

**Complexity:** O(n³) time, O(n²) space.
