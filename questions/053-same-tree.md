# 053. Same Tree

**Question:** Determine whether two binary trees have identical structure and values.

**Answer:** Both null nodes match; otherwise values must match and both child pairs must match.

```java
boolean same(TreeNode a, TreeNode b) {
    if (a == null || b == null) return a == b;
    return a.value == b.value && same(a.left, b.left) && same(a.right, b.right);
}
```

**Complexity:** O(n) time, O(h) space.
