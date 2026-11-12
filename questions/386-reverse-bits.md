# 386. Reverse Bits

**Question:** Reverse the bits of a 32-bit unsigned integer.

**Answer:** Shift the result left and append the lowest bit of n, 32 times.

```java
int res = 0;
for (int i = 0; i < 32; i++) {
    res = (res << 1) | (n & 1);
    n >>>= 1;
}
return res;
```

**Complexity:** O(1) time (32 iterations), O(1) space.
