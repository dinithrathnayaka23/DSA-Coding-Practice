# 246. Gray Code

**Question:** Generate an n-bit sequence where consecutive values differ by one bit.

**Answer:** The ith Gray code is `i ^ (i >>> 1)`.

```java
for (int i = 0; i < (1 << n); i++) answer.add(i ^ (i >>> 1));
```

**Complexity:** O(2^n) time and output space.
