# 324. Container With Most Water

**Question:** Pick two lines that, with the x-axis, hold the most water.

**Answer:** Move the pointer at the shorter line inward since only a taller line can improve the area.

```java
int l = 0, r = h.length - 1, best = 0;
while (l < r) {
    best = Math.max(best, Math.min(h[l], h[r]) * (r - l));
    if (h[l] < h[r]) l++; else r--;
}
return best;
```

**Complexity:** O(n) time, O(1) space.
