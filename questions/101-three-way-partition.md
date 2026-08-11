# 101. Three-Way Partition

**Question:** Partition an array of values `0`, `1`, and `2` in place.

**Answer:** Keep low, current, and high boundaries and apply the Dutch national flag algorithm.

```java
int low = 0, current = 0, high = nums.length - 1;
while (current <= high) {
    if (nums[current] == 0) swap(nums, low++, current++);
    else if (nums[current] == 2) swap(nums, current, high--);
    else current++;
}
```

**Complexity:** O(n) time, O(1) space.
