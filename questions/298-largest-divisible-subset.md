# 298. Largest Divisible Subset

**Question:** Find the largest subset where every pair is divisible in one direction.

**Answer:** Sort values and use LIS-style DP where `values[i] % values[j] == 0`.

```java
Arrays.sort(values); for (int i = 0; i < values.length; i++) for (int j = 0; j < i; j++) if (values[i] % values[j] == 0 && length[i] < length[j] + 1) { length[i] = length[j] + 1; previous[i] = j; }
```

**Complexity:** O(n²) time, O(n) space.
