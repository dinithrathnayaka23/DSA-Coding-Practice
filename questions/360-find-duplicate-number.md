# 360. Find the Duplicate Number

**Question:** An array of n+1 values in 1..n has one repeated value; find it without modifying the array.

**Answer:** Treat values as next pointers and use Floyd's cycle detection to find the cycle entrance.

```java
int slow = nums[0], fast = nums[0];
do {
    slow = nums[slow];
    fast = nums[nums[fast]];
} while (slow != fast);
slow = nums[0];
while (slow != fast) {
    slow = nums[slow];
    fast = nums[fast];
}
return slow;
```

**Complexity:** O(n) time, O(1) space.
