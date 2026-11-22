# 439. Single Number II

**Question:** Every value appears three times except one that appears once; find it in O(1) space.

**Answer:** Track bits seen once and twice with two accumulators that reset on the third occurrence.

```java
int ones = 0, twos = 0;
for (int x : nums) {
    ones = (ones ^ x) & ~twos;
    twos = (twos ^ x) & ~ones;
}
return ones;
```

**Complexity:** O(n) time, O(1) space.
