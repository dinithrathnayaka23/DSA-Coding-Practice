# 373. Symmetric Tree

**Question:** Check whether a binary tree is a mirror of itself.

**Answer:** Compare the left subtree with the right subtree in mirrored order.

```java
boolean mirror(TreeNode a, TreeNode b) {
    if (a == null || b == null) return a == b;
    return a.val == b.val && mirror(a.left, b.right) && mirror(a.right, b.left);
}
// call: mirror(root.left, root.right)
```

**Complexity:** O(n) time, O(h) space.
