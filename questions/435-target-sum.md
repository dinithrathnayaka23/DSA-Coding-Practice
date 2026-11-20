# 435. Target Sum

**Question:** Count the ways to assign + or - to each number so the total equals a target.

**Answer:** Reduce to a subset-sum count: choose a subset summing to (total + target) / 2.

```java
int total = 0;
for (int x : nums) total += x;
if (Math.abs(target) > total || (total + target) % 2 != 0) return 0;
int need = (total + target) / 2;
int[] dp = new int[need + 1];
dp[0] = 1;
for (int x : nums)
    for (int s = need; s >= x; s--)
        dp[s] += dp[s - x];
return dp[need];
```

**Complexity:** O(n · sum) time, O(sum) space.
