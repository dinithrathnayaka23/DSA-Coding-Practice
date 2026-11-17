# 410. First Missing Positive

**Question:** Find the smallest missing positive integer in O(n) time and O(1) space.

**Answer:** Place each value v in slot v-1 by swapping, then scan for the first mismatch.

```java
for (int i = 0; i < nums.length; i++)
    while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
        int j = nums[i] - 1;
        int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
    }
for (int i = 0; i < nums.length; i++)
    if (nums[i] != i + 1) return i + 1;
return nums.length + 1;
```

**Complexity:** O(n) time, O(1) space.
