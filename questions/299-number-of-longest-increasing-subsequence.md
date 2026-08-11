# 299. Number of Longest Increasing Subsequences

**Question:** Count increasing subsequences having maximum length.

**Answer:** Track both the longest length and number of ways ending at each index.

```java
for (int i = 0; i < n; i++) for (int j = 0; j < i; j++) if (nums[j] < nums[i]) { if (length[j] + 1 > length[i]) { length[i] = length[j] + 1; ways[i] = ways[j]; } else if (length[j] + 1 == length[i]) ways[i] += ways[j]; }
```

**Complexity:** O(n²) time, O(n) space.
