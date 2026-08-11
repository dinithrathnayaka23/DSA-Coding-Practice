# 110. Median of Two Sorted Arrays

**Question:** Find the median of two sorted arrays in logarithmic time.

**Answer:** Binary-search a partition in the smaller array so left-side values are all no larger than right-side values.

```java
int low = 0, high = a.length;
while (low <= high) { int cutA = (low + high) >>> 1, cutB = (a.length + b.length + 1) / 2 - cutA;
    if (leftTooLarge(a, b, cutA, cutB)) high = cutA - 1; else if (rightTooSmall(a, b, cutA, cutB)) low = cutA + 1; else return medianAtPartition(a, b, cutA, cutB);
}
throw new IllegalArgumentException();
```

**Complexity:** O(log min(n, m)) time, O(1) space.
