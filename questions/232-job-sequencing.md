# 232. Job Sequencing With Deadlines

**Question:** Schedule unit-time jobs for maximum profit before deadlines.

**Answer:** Sort by profit and place each job in the latest free slot before its deadline.

```java
Arrays.sort(jobs, Comparator.comparingInt(Job::profit).reversed()); boolean[] used = new boolean[maxDeadline + 1]; for (Job job : jobs) for (int slot = Math.min(job.deadline(), maxDeadline); slot > 0; slot--) if (!used[slot]) { used[slot] = true; profit += job.profit(); break; }
```

**Complexity:** O(n · maxDeadline) time, O(maxDeadline) space.
