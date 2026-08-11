# 018. Find the Duplicate Number

**Question:** Find the repeated value in an array of `n + 1` values from `1` to `n` without modifying the array.

**Answer:** Treat values as pointers and use Floyd's cycle detection to find the cycle entrance.

```java
int slow = nums[0], fast = nums[0];
do { slow = nums[slow]; fast = nums[nums[fast]]; } while (slow != fast);
slow = nums[0];
while (slow != fast) { slow = nums[slow]; fast = nums[fast]; }
return slow;
```

**Complexity:** O(n) time, O(1) space.
