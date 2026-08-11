# 210. Target Sum

**Question:** Count sign assignments that make an array sum to a target.

**Answer:** Convert the problem to counting subsets with sum `(total + target) / 2`.

```java
int targetSubset = (total + target) / 2; int[] dp = new int[targetSubset + 1]; dp[0] = 1;
for (int value : nums) for (int sum = targetSubset; sum >= value; sum--) dp[sum] += dp[sum - value];
return total + target < 0 || (total + target) % 2 != 0 ? 0 : dp[targetSubset];
```

**Complexity:** O(n · targetSubset) time, O(targetSubset) space.
