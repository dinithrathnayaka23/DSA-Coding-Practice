# 437. Hamming Distance

**Question:** Count the bit positions where two integers differ.

**Answer:** XOR the numbers and count set bits.

```java
int x = a ^ b, count = 0;
while (x != 0) {
    x &= x - 1;
    count++;
}
return count;
```

**Complexity:** O(1) time (32 bits), O(1) space.
