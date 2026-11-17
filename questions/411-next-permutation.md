# 411. Next Permutation

**Question:** Rearrange numbers into the next lexicographically greater permutation in place.

**Answer:** Find the last ascent, swap with the next larger value from the right, and reverse the suffix.

```java
int i = nums.length - 2;
while (i >= 0 && nums[i] >= nums[i + 1]) i--;
if (i >= 0) {
    int j = nums.length - 1;
    while (nums[j] <= nums[i]) j--;
    int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
}
for (int l = i + 1, r = nums.length - 1; l < r; l++, r--) {
    int t = nums[l]; nums[l] = nums[r]; nums[r] = t;
}
```

**Complexity:** O(n) time, O(1) space.
