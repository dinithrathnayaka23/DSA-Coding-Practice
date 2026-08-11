# 244. Multiply Without Multiply

**Question:** Multiply two integers using shifts and addition.

**Answer:** Russian peasant multiplication doubles one operand and halves the other, adding selected doubles.

```java
long result = 0; while (b != 0) { if ((b & 1) != 0) result += a; a <<= 1; b >>>= 1; } return result;
```

**Complexity:** O(word size) time, O(1) space.
