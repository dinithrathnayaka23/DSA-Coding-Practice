# 233. Weighted Interval Scheduling

**Question:** Select non-overlapping jobs for maximum total profit.

**Answer:** Sort by finish time and choose between skipping a job or adding it to the best compatible predecessor.

```java
Arrays.sort(jobs, Comparator.comparingInt(Job::finish)); for (int i = 1; i <= jobs.length; i++) { int previous = lastCompatible(jobs, i - 1); dp[i] = Math.max(dp[i - 1], jobs[i - 1].profit() + dp[previous]); } return dp[jobs.length];
```

**Complexity:** O(n log n) time with binary search for compatibility, O(n) space.
