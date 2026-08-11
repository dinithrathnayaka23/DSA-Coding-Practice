# 092. Fast Power

**Question:** Compute `x` raised to an integer exponent efficiently.

**Answer:** Binary exponentiation squares the base and processes one exponent bit per iteration.

```java
long exponent = n; if (exponent < 0) { x = 1 / x; exponent = -exponent; }
double result = 1;
while (exponent > 0) { if ((exponent & 1) == 1) result *= x; x *= x; exponent >>= 1; }
return result;
```

**Complexity:** O(log |n|) time, O(1) space.
