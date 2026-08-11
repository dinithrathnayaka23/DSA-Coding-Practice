# 022. Search in a Rotated Sorted Array

**Question:** Search for a target in a sorted array rotated at an unknown pivot.

**Answer:** At each step, one half is still sorted; decide whether the target lies inside that half.

```java
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    if (nums[left] <= nums[mid]) {
        if (nums[left] <= target && target < nums[mid]) right = mid - 1; else left = mid + 1;
    } else if (nums[mid] < target && target <= nums[right]) left = mid + 1; else right = mid - 1;
}
return -1;
```

**Complexity:** O(log n) time, O(1) space.
