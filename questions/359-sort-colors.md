# 359. Sort Colors

**Question:** Sort an array of 0s, 1s, and 2s in place in one pass.

**Answer:** Dutch national flag: keep pointers for the 0 boundary, the current element, and the 2 boundary.

```java
int lo = 0, mid = 0, hi = nums.length - 1;
while (mid <= hi) {
    if (nums[mid] == 0) { int t = nums[lo]; nums[lo++] = nums[mid]; nums[mid++] = t; }
    else if (nums[mid] == 1) mid++;
    else { int t = nums[hi]; nums[hi--] = nums[mid]; nums[mid] = t; }
}
```

**Complexity:** O(n) time, O(1) space.
