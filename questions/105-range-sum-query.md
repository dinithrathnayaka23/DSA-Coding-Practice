# 105. Range Sum Query

**Question:** Answer immutable sum queries for any subarray `[left, right]`.

**Answer:** A prefix array makes each range sum the difference of two prefix values.

```java
int[] prefix = new int[nums.length + 1];
for (int i = 0; i < nums.length; i++) prefix[i + 1] = prefix[i] + nums[i];
int sumRange(int left, int right) { return prefix[right + 1] - prefix[left]; }
```

**Complexity:** O(n) preprocessing, O(1) per query, O(n) space.
