# 083. Jump Game II

**Question:** Find the minimum jumps needed to reach the last index.

**Answer:** Greedily scan the current jump range and extend the next range to the farthest reachable index.

```java
int jumps = 0, end = 0, farthest = 0;
for (int i = 0; i < nums.length - 1; i++) {
    farthest = Math.max(farthest, i + nums[i]);
    if (i == end) { jumps++; end = farthest; }
}
return jumps;
```

**Complexity:** O(n) time, O(1) space.
