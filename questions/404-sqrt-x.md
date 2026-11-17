# 404. Sqrt(x)

**Question:** Return the integer square root of a non-negative integer.

**Answer:** Binary search for the largest m with m * m <= x.

```java
int lo = 0, hi = x;
while (lo < hi) {
    int mid = lo + (hi - lo + 1) / 2;
    if (mid <= x / mid) lo = mid; else hi = mid - 1;
}
return lo;
```

**Complexity:** O(log x) time, O(1) space.
