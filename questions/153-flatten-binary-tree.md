# 153. Flatten Binary Tree to Linked List

**Question:** Flatten a binary tree in preorder using right pointers only.

**Answer:** For each node with a left child, move its left subtree between the node and its right subtree.

```java
for (TreeNode node = root; node != null; node = node.right) if (node.left != null) {
    TreeNode tail = node.left; while (tail.right != null) tail = tail.right; tail.right = node.right; node.right = node.left; node.left = null;
}
```

**Complexity:** O(n) amortized time, O(1) space.
