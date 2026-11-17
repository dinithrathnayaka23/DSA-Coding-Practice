# 403. Pow(x, n)

**Question:** Compute x raised to the power n.

**Answer:** Fast exponentiation by squaring; handle negative n with a long exponent.

```java
double myPow(double x, int n) {
    long e = n;
    if (e < 0) { x = 1 / x; e = -e; }
    double res = 1;
    while (e > 0) {
        if ((e & 1) == 1) res *= x;
        x *= x;
        e >>= 1;
    }
    return res;
}
```

**Complexity:** O(log n) time, O(1) space.
