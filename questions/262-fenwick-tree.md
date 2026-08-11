# 262. Fenwick Tree

**Question:** Support point updates and prefix sums efficiently.

**Answer:** Each index stores a range sized by its lowest set bit.

```java
void add(int index, int delta) { for (index++; index < tree.length; index += index & -index) tree[index] += delta; }
int sum(int index) { int answer = 0; for (index++; index > 0; index -= index & -index) answer += tree[index]; return answer; }
```

**Complexity:** O(log n) update/query, O(n) space.
