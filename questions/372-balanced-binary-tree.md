# 372. Balanced Binary Tree

**Question:** Check whether every node's subtree heights differ by at most one.

**Answer:** Return -1 from the height function as soon as an imbalance is found.

```java
int height(TreeNode n) {
    if (n == null) return 0;
    int l = height(n.left);
    if (l < 0) return -1;
    int r = height(n.right);
    if (r < 0 || Math.abs(l - r) > 1) return -1;
    return 1 + Math.max(l, r);
}
// balanced if height(root) >= 0
```

**Complexity:** O(n) time, O(h) space.
