# 384. Counting Bits

**Question:** Return the number of 1 bits for every number from 0 to n.

**Answer:** bits[i] equals bits[i / 2] plus the lowest bit of i.

```java
int[] bits = new int[n + 1];
for (int i = 1; i <= n; i++) bits[i] = bits[i >> 1] + (i & 1);
return bits;
```

**Complexity:** O(n) time and space.
