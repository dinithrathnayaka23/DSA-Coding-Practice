# 091. Greatest Common Divisor

**Question:** Find the greatest common divisor of two non-negative integers.

**Answer:** Euclid's algorithm repeatedly replaces `(a, b)` with `(b, a mod b)`.

```java
while (b != 0) { int remainder = a % b; a = b; b = remainder; }
return Math.abs(a);
```

**Complexity:** O(log min(a, b)) time, O(1) space.
