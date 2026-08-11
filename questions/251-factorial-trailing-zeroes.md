# 251. Factorial Trailing Zeroes

**Question:** Count trailing zeroes in `n!`.

**Answer:** Each zero comes from a factor pair 2×5; count factors of five.

```java
int zeroes = 0; while (n > 0) { n /= 5; zeroes += n; } return zeroes;
```

**Complexity:** O(log₅ n) time, O(1) space.
