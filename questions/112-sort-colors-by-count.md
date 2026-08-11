# 112. Sort Colors by Counts

**Question:** Sort an array containing a small known set of colors.

**Answer:** Count each color, then write the counts back in color order.

```java
int[] counts = new int[3]; for (int color : colors) counts[color]++;
int write = 0; for (int color = 0; color < counts.length; color++) while (counts[color]-- > 0) colors[write++] = color;
```

**Complexity:** O(n + colors) time, O(colors) space.
