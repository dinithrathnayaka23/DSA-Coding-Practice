# 385. Power of Two

**Question:** Check whether an integer is a power of two.

**Answer:** A power of two has exactly one set bit, so n & (n - 1) is zero.

```java
return n > 0 && (n & (n - 1)) == 0;
```

**Complexity:** O(1) time and space.
