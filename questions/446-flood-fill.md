# 446. Flood Fill

**Question:** Recolor a connected region of same-colored pixels starting from a given cell.

**Answer:** DFS from the start cell, recoloring while the pixel has the original color.

```java
int old = img[sr][sc];
if (old != color) fill(img, sr, sc, old, color);
return img;

void fill(int[][] g, int r, int c, int old, int color) {
    if (r < 0 || c < 0 || r >= g.length || c >= g[0].length || g[r][c] != old) return;
    g[r][c] = color;
    fill(g, r + 1, c, old, color); fill(g, r - 1, c, old, color);
    fill(g, r, c + 1, old, color); fill(g, r, c - 1, old, color);
}
```

**Complexity:** O(m · n) time and recursion space.
