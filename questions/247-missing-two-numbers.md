# 247. Missing Two Numbers

**Question:** Find two missing values from `0..n` using XOR.

**Answer:** XOR all expected and observed values, split the two missing values by a differing bit, and XOR each group.

```java
int xor = n; for (int i = 0; i < nums.length; i++) xor ^= i ^ nums[i]; int bit = xor & -xor, first = 0, second = 0; for (int i = 0; i <= n; i++) if ((i & bit) == 0) first ^= i; else second ^= i; for (int value : nums) if ((value & bit) == 0) first ^= value; else second ^= value; return new int[]{first, second};
```

**Complexity:** O(n) time, O(1) space.
