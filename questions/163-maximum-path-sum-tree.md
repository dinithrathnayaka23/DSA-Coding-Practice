# 163. Binary Tree Maximum Path Sum

**Question:** Find the maximum sum of any path in a binary tree.

**Answer:** A node contributes its value plus the larger positive child gain to its parent, while both gains may form a complete path.

```java
int gain(TreeNode node) { if (node == null) return 0; int left = Math.max(0, gain(node.left)), right = Math.max(0, gain(node.right)); best = Math.max(best, node.value + left + right); return node.value + Math.max(left, right); }
```

**Complexity:** O(n) time, O(h) space.
