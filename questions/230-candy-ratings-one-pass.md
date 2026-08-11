# 230. Candy in One Pass

**Question:** Compute the minimum candies from ratings using constant extra space.

**Answer:** Sum increasing and decreasing slopes; the peak is shared by both runs.

```java
int candies = 1, up = 0, down = 0, previousSlope = 0; for (int i = 1; i < ratings.length; i++) { int slope = Integer.compare(ratings[i], ratings[i - 1]); if (previousSlope > 0 && slope == 0 || previousSlope < 0 && slope >= 0) { candies += triangle(up) + triangle(down) + Math.max(up, down); up = down = 0; } if (slope > 0) up++; else if (slope < 0) down++; else candies++; previousSlope = slope; } return candies + triangle(up) + triangle(down) + Math.max(up, down);
```

**Complexity:** O(n) time, O(1) space.
