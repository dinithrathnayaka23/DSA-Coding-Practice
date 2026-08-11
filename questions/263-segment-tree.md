# 263. Segment Tree

**Question:** Support range queries and point updates over an array.

**Answer:** Recursively store each interval's aggregate in a tree; query only intersecting nodes.

```java
void update(int node, int left, int right, int index, int value) { if (left == right) { tree[node] = value; return; } int mid = (left + right) >>> 1; if (index <= mid) update(node * 2, left, mid, index, value); else update(node * 2 + 1, mid + 1, right, index, value); tree[node] = combine(tree[node * 2], tree[node * 2 + 1]); }
```

**Complexity:** O(log n) update/query, O(n) space.
