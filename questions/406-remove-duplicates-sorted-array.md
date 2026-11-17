# 406. Remove Duplicates from Sorted Array

**Question:** Remove duplicates in place from a sorted array and return the new length.

**Answer:** Write pointer advances only when a new value appears.

```java
int w = 1;
for (int r = 1; r < nums.length; r++)
    if (nums[r] != nums[w - 1]) nums[w++] = nums[r];
return w;
```

**Complexity:** O(n) time, O(1) space.
