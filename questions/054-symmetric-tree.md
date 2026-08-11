# 054. Symmetric Tree

**Question:** Check whether a binary tree is a mirror of itself.

**Answer:** Compare the left subtree of one side with the right subtree of the other side.

```java
boolean mirror(TreeNode a, TreeNode b) {
    if (a == null || b == null) return a == b;
    return a.value == b.value && mirror(a.left, b.right) && mirror(a.right, b.left);
}
return mirror(root.left, root.right);
```

**Complexity:** O(n) time, O(h) space.
