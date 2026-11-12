# 371. Diameter of Binary Tree

**Question:** Find the length of the longest path between any two nodes of a binary tree.

**Answer:** At each node the path through it is left depth plus right depth; track the maximum.

```java
int best = 0;
int depth(TreeNode n) {
    if (n == null) return 0;
    int l = depth(n.left), r = depth(n.right);
    best = Math.max(best, l + r);
    return 1 + Math.max(l, r);
}
```

**Complexity:** O(n) time, O(h) space.
