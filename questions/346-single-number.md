# 346. Single Number

**Question:** Every value appears twice except one; find it in O(1) space.

**Answer:** XOR cancels equal pairs, leaving the unique value.

```java
int x = 0;
for (int n : nums) x ^= n;
return x;
```

**Complexity:** O(n) time, O(1) space.
