# 011. Three Sum

**Question:** Return all unique triples whose values sum to zero.

**Answer:** Sort first; fix one value and solve the remaining pair with two pointers, skipping duplicates.

```java
Arrays.sort(nums);
for (int i = 0; i < nums.length - 2; i++) {
    if (i > 0 && nums[i] == nums[i - 1]) continue;
    int left = i + 1, right = nums.length - 1;
    while (left < right) {
        long sum = (long) nums[i] + nums[left] + nums[right];
        if (sum == 0) { result.add(List.of(nums[i], nums[left++], nums[right--]));
            while (left < right && nums[left] == nums[left - 1]) left++; }
        else if (sum < 0) left++; else right--;
    }
}
```

**Complexity:** O(n²) time, O(1) extra space excluding the result.
