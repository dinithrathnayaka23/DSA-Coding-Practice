# 427. Car Fleet

**Question:** Count the fleets of cars driving to a target at different speeds, where a car cannot pass another.

**Answer:** Sort by start position descending; a car joins the fleet ahead unless it arrives later.

```java
int n = pos.length;
Integer[] idx = new Integer[n];
for (int i = 0; i < n; i++) idx[i] = i;
Arrays.sort(idx, (a, b) -> pos[b] - pos[a]);
int fleets = 0;
double slowest = 0;
for (int i : idx) {
    double t = (double) (target - pos[i]) / speed[i];
    if (t > slowest) { fleets++; slowest = t; }
}
return fleets;
```

**Complexity:** O(n log n) time, O(n) space.
