# 317. Jump Game

**Question:** Decide whether you can reach the last index when each value is the maximum jump length.

**Answer:** Track the furthest reachable index; fail if the scan passes it.

```java
int far = 0;
for (int i = 0; i < nums.length; i++) {
    if (i > far) return false;
    far = Math.max(far, i + nums[i]);
}
return true;
```

**Complexity:** O(n) time, O(1) space.
