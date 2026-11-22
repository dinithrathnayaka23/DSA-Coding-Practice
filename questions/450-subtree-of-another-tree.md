# 450. Subtree of Another Tree

**Question:** Check whether one tree appears as a subtree of another.

**Answer:** At every node of the main tree, test whether the subtree rooted there is identical.

```java
boolean isSubtree(TreeNode root, TreeNode sub) {
    if (root == null) return sub == null;
    return same(root, sub) || isSubtree(root.left, sub) || isSubtree(root.right, sub);
}
boolean same(TreeNode a, TreeNode b) {
    if (a == null || b == null) return a == b;
    return a.val == b.val && same(a.left, b.left) && same(a.right, b.right);
}
```

**Complexity:** O(n · m) time, O(h) space.
