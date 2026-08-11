# 093. Count Set Bits

**Question:** Count the `1` bits in an integer's binary representation.

**Answer:** `n & (n - 1)` removes the lowest set bit each iteration.

```java
int count = 0;
while (n != 0) { n &= n - 1; count++; }
return count;
```

**Complexity:** O(number of set bits) time, O(1) space.
