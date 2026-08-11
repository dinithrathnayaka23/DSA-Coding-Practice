# 052. Invert Binary Tree

**Question:** Mirror a binary tree by swapping every node's left and right children.

**Answer:** Swap children recursively or with a queue.

```java
TreeNode invert(TreeNode node) {
    if (node == null) return null;
    TreeNode left = node.left; node.left = invert(node.right); node.right = invert(left);
    return node;
}
```

**Complexity:** O(n) time, O(h) recursion space.
