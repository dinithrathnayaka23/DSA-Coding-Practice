# 438. Sum of Two Integers

**Question:** Add two integers without using + or -.

**Answer:** XOR gives the sum without carry; AND shifted left gives the carry. Repeat until no carry.

```java
while (b != 0) {
    int carry = (a & b) << 1;
    a ^= b;
    b = carry;
}
return a;
```

**Complexity:** O(1) time (32 iterations), O(1) space.
