# 261. Nth Ugly Number

**Question:** Find the nth positive number whose prime factors are only 2, 3, and 5.

**Answer:** Three pointers generate the next multiple of each prime and advance every pointer that matches.

```java
for (int i = 1; i < n; i++) { values[i] = Math.min(values[p2] * 2, Math.min(values[p3] * 3, values[p5] * 5)); if (values[i] == values[p2] * 2) p2++; if (values[i] == values[p3] * 3) p3++; if (values[i] == values[p5] * 5) p5++; } return values[n - 1];
```

**Complexity:** O(n) time, O(n) space.
