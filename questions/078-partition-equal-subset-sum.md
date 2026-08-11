# 078. Partition Equal Subset Sum

**Question:** Decide whether values can be divided into two subsets with equal sum.

**Answer:** The target is half the total; update a boolean knapsack from right to left for each value.

```java
boolean[] possible = new boolean[target + 1]; possible[0] = true;
for (int value : nums) for (int sum = target; sum >= value; sum--)
    possible[sum] |= possible[sum - value];
return possible[target];
```

**Complexity:** O(n · target) time, O(target) space.
