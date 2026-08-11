# 220. Delete and Earn

**Question:** Choose numbers for points while deleting every adjacent value.

**Answer:** Aggregate points per value, then solve a house-robber problem over the value range.

```java
int[] points = new int[max + 1]; for (int value : nums) points[value] += value; int skip = 0, take = 0; for (int value : points) { int next = Math.max(skip, take); take = skip + value; skip = next; } return Math.max(skip, take);
```

**Complexity:** O(n + maxValue) time, O(maxValue) space.
