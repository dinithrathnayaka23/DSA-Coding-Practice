# 415. Gas Station

**Question:** Find the starting station that lets you complete a circular route, or -1.

**Answer:** If total gas covers total cost a start exists; restart whenever the running tank goes negative.

```java
int total = 0, tank = 0, start = 0;
for (int i = 0; i < gas.length; i++) {
    int diff = gas[i] - cost[i];
    total += diff;
    tank += diff;
    if (tank < 0) { start = i + 1; tank = 0; }
}
return total >= 0 ? start : -1;
```

**Complexity:** O(n) time, O(1) space.
