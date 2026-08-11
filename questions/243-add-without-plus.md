# 243. Add Without Plus

**Question:** Add two integers without using `+` or `-`.

**Answer:** XOR adds without carries; AND shifted left produces carries.

```java
while (b != 0) { int carry = (a & b) << 1; a ^= b; b = carry; } return a;
```

**Complexity:** O(word size) time, O(1) space.
