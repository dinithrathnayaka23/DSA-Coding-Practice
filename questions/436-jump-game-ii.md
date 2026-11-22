# 436. Jump Game II

**Question:** Find the minimum number of jumps to reach the last index, where each value is the maximum jump length.

**Answer:** Greedy BFS by ranges: count a jump each time the scan passes the current range end.

```java
int jumps = 0, end = 0, far = 0;
for (int i = 0; i < nums.length - 1; i++) {
    far = Math.max(far, i + nums[i]);
    if (i == end) { jumps++; end = far; }
}
return jumps;
```

**Complexity:** O(n) time, O(1) space.
