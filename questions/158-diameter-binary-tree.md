# 158. Diameter of a Binary Tree

**Question:** Find the longest path between any two tree nodes.

**Answer:** The path through a node is the sum of its left and right subtree heights.

```java
int height(TreeNode node) { if (node == null) return 0; int left = height(node.left), right = height(node.right); diameter = Math.max(diameter, left + right); return 1 + Math.max(left, right); }
```

**Complexity:** O(n) time, O(h) space.
