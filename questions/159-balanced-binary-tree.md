# 159. Balanced Binary Tree

**Question:** Check whether every node's two subtree heights differ by at most one.

**Answer:** Return `-1` immediately when a subtree is unbalanced, avoiding repeated height calculations.

```java
int heightOrFail(TreeNode node) { if (node == null) return 0; int left = heightOrFail(node.left), right = heightOrFail(node.right); if (left < 0 || right < 0 || Math.abs(left - right) > 1) return -1; return 1 + Math.max(left, right); }
return heightOrFail(root) >= 0;
```

**Complexity:** O(n) time, O(h) space.
