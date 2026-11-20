# 433. Unique Binary Search Trees

**Question:** Count the structurally unique BSTs that store values 1..n.

**Answer:** Catalan recurrence: pick each root and multiply the counts of the left and right sides.

```java
int[] dp = new int[n + 1];
dp[0] = dp[1] = 1;
for (int nodes = 2; nodes <= n; nodes++)
    for (int root = 1; root <= nodes; root++)
        dp[nodes] += dp[root - 1] * dp[nodes - root];
return dp[n];
```

**Complexity:** O(n²) time, O(n) space.
