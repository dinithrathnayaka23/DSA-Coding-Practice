# 302. Move Zeroes

**Question:** Move all zeroes to the end of an array in place, keeping the order of non-zero values.

**Answer:** Keep a write pointer for the next non-zero slot and swap as you scan.

```java
int w = 0;
for (int r = 0; r < nums.length; r++) {
    if (nums[r] != 0) {
        int t = nums[w]; nums[w++] = nums[r]; nums[r] = t;
    }
}
```

**Complexity:** O(n) time, O(1) space.
