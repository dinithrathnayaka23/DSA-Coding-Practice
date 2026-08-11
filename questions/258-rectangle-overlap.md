# 258. Rectangle Overlap

**Question:** Decide whether two axis-aligned rectangles overlap with positive area.

**Answer:** Their horizontal and vertical projections must both overlap strictly.

```java
return Math.min(a.right(), b.right()) > Math.max(a.left(), b.left()) && Math.min(a.top(), b.top()) > Math.max(a.bottom(), b.bottom());
```

**Complexity:** O(1) time and space.
