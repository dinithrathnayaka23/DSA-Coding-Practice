# 005. Move Zeroes

**Question:** Move all zeroes to the end while preserving the order of non-zero values.

**Answer:** Use a write pointer for the next non-zero position, then fill the remainder with zeroes.

```java
int write = 0;
for (int value : nums) if (value != 0) nums[write++] = value;
while (write < nums.length) nums[write++] = 0;
```

**Complexity:** O(n) time, O(1) space.
