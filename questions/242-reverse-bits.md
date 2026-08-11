# 242. Reverse Bits

**Question:** Reverse the 32 bits of an integer.

**Answer:** Shift the result left and append the source's least significant bit 32 times.

```java
int answer = 0; for (int i = 0; i < 32; i++) { answer = (answer << 1) | (value & 1); value >>>= 1; } return answer;
```

**Complexity:** O(1) time, O(1) space.
