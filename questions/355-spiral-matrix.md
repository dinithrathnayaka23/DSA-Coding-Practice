# 355. Spiral Matrix

**Question:** Return all elements of a matrix in spiral order.

**Answer:** Shrink four boundaries (top, bottom, left, right) as each edge is traversed.

```java
List<Integer> res = new ArrayList<>();
int top = 0, bot = m.length - 1, left = 0, right = m[0].length - 1;
while (top <= bot && left <= right) {
    for (int c = left; c <= right; c++) res.add(m[top][c]);
    top++;
    for (int r = top; r <= bot; r++) res.add(m[r][right]);
    right--;
    if (top <= bot) { for (int c = right; c >= left; c--) res.add(m[bot][c]); bot--; }
    if (left <= right) { for (int r = bot; r >= top; r--) res.add(m[r][left]); left++; }
}
return res;
```

**Complexity:** O(rows · columns) time, O(1) extra space.
