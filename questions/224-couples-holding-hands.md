# 224. Couples Holding Hands

**Question:** Find minimum swaps so each adjacent pair is a couple.

**Answer:** For each first seat, swap in its partner and update positions.

```java
for (int i = 0; i < row.length; i += 2) { int partner = row[i] ^ 1; if (row[i + 1] != partner) { int j = position[partner]; swap(row, i + 1, j); } }
```

**Complexity:** O(n) with position updates, O(n) space.
