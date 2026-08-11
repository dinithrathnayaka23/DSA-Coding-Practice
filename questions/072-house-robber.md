# 072. House Robber

**Question:** Maximize stolen value without robbing adjacent houses.

**Answer:** At each house choose the larger of skipping it or adding it to the best result two houses back.

```java
int previousTwo = 0, previousOne = 0;
for (int money : nums) { int current = Math.max(previousOne, previousTwo + money); previousTwo = previousOne; previousOne = current; }
return previousOne;
```

**Complexity:** O(n) time, O(1) space.
