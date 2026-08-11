# 241. XOR From L to R

**Question:** Compute the XOR of all integers in an inclusive range.

**Answer:** XOR from zero through `n` repeats in a four-value pattern.

```java
int prefixXor(int n) { return switch (n & 3) { case 0 -> n; case 1 -> 1; case 2 -> n + 1; default -> 0; }; }
return prefixXor(right) ^ prefixXor(left - 1);
```

**Complexity:** O(1) time, O(1) space.
