# 449. Same Tree

**Question:** Check whether two binary trees are structurally identical with equal values.

**Answer:** Compare roots, then recurse on both pairs of children.

```java
if (p == null || q == null) return p == q;
return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
```

**Complexity:** O(n) time, O(h) space.
