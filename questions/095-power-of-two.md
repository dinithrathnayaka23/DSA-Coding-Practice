# 095. Power of Two

**Question:** Decide whether a positive integer is a power of two.

**Answer:** A power of two has exactly one set bit, so removing its lowest bit yields zero.

```java
return n > 0 && (n & (n - 1)) == 0;
```

**Complexity:** O(1) time, O(1) space.
