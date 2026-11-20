# 423. Two City Scheduling

**Question:** Send half of the people to each of two cities at minimum total cost.

**Answer:** Sort by the cost difference (a - b); the first half go to city A, the rest to city B.

```java
Arrays.sort(costs, (x, y) -> (x[0] - x[1]) - (y[0] - y[1]));
int total = 0, n = costs.length / 2;
for (int i = 0; i < n; i++) total += costs[i][0] + costs[i + n][1];
return total;
```

**Complexity:** O(n log n) time, O(1) extra space.
