# 321. Search in Rotated Sorted Array

**Question:** Find a target in a sorted array that has been rotated at an unknown pivot.

**Answer:** At each step one half is sorted; check whether the target falls inside it.

```java
int lo = 0, hi = nums.length - 1;
while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    if (nums[mid] == target) return mid;
    if (nums[lo] <= nums[mid]) {
        if (nums[lo] <= target && target < nums[mid]) hi = mid - 1; else lo = mid + 1;
    } else {
        if (nums[mid] < target && target <= nums[hi]) lo = mid + 1; else hi = mid - 1;
    }
}
return -1;
```

**Complexity:** O(log n) time, O(1) space.
