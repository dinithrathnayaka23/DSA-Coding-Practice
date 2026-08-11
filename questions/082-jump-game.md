# 082. Jump Game

**Question:** Decide whether the last array index is reachable when each value is a maximum jump length.

**Answer:** Scan backward from the goal and move the goal left whenever the current index can reach it.

```java
int goal = nums.length - 1;
for (int i = goal - 1; i >= 0; i--) if (i + nums[i] >= goal) goal = i;
return goal == 0;
```

**Complexity:** O(n) time, O(1) space.
