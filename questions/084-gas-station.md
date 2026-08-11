# 084. Gas Station

**Question:** Find the starting station from which a car can complete a circular route, or `-1`.

**Answer:** If total gas is enough, whenever the running tank becomes negative, the next station must be the new start.

```java
int total = 0, tank = 0, start = 0;
for (int i = 0; i < gas.length; i++) { int gain = gas[i] - cost[i]; total += gain; tank += gain;
    if (tank < 0) { start = i + 1; tank = 0; }
}
return total < 0 ? -1 : start;
```

**Complexity:** O(n) time, O(1) space.
