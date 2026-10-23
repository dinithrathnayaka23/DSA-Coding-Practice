# 336. Invert Binary Tree

**Question:** Mirror a binary tree by swapping left and right children everywhere.

**Answer:** Recursively invert both subtrees and swap them.

```java
if (root == null) return null;
TreeNode left = invertTree(root.left);
TreeNode right = invertTree(root.right);
root.left = right;
root.right = left;
return root;
```

**Complexity:** O(n) time, O(h) space.
