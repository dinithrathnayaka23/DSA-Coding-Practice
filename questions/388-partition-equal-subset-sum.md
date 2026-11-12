# 388. Partition Equal Subset Sum

**Question:** Decide whether an array can be split into two subsets with equal sums.

**Answer:** Subset-sum DP for half of the total, iterating sums downward.

```java
int total = 0;
for (int x : nums) total += x;
if (total % 2 != 0) return false;
int half = total / 2;
boolean[] dp = new boolean[half + 1];
dp[0] = true;
for (int x : nums)
    for (int s = half; s >= x; s--)
        dp[s] |= dp[s - x];
return dp[half];
```

**Complexity:** O(n · sum) time, O(sum) space.
