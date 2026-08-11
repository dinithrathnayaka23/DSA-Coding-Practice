# 288. Max Points on a Line

**Question:** Find the largest number of points on one straight line.

**Answer:** For each anchor point, count normalized slopes to every later point.

```java
for (int i = 0; i < points.length; i++) { Map<Slope, Integer> slopes = new HashMap<>(); for (int j = i + 1; j < points.length; j++) slopes.merge(normalize(points[i], points[j]), 1, Integer::sum); best = Math.max(best, 1 + slopes.values().stream().mapToInt(x -> x).max().orElse(0)); }
```

**Complexity:** O(n²) time, O(n) space per anchor.
