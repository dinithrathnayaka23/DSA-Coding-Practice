# 012. Container With Most Water

**Question:** Find the two lines that hold the greatest amount of water.

**Answer:** Start at both ends and move the shorter line inward, because the taller line cannot improve while the shorter one remains.

```java
int left = 0, right = height.length - 1, best = 0;
while (left < right) {
    best = Math.max(best, (right - left) * Math.min(height[left], height[right]));
    if (height[left] < height[right]) left++; else right--;
}
return best;
```

**Complexity:** O(n) time, O(1) space.
