# 383. Number of 1 Bits

**Question:** Count the set bits in an integer.

**Answer:** Clear the lowest set bit each step with n & (n - 1).

```java
int count = 0;
while (n != 0) {
    n &= n - 1;
    count++;
}
return count;
```

**Complexity:** O(k) time for k set bits, O(1) space.
