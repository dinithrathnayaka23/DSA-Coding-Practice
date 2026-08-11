# 160. Path Sum

**Question:** Determine whether a root-to-leaf path has a target sum.

**Answer:** Subtract each node value and succeed when a leaf reaches zero.

```java
boolean hasPath(TreeNode node, int target) { if (node == null) return false; target -= node.value; if (node.left == null && node.right == null) return target == 0; return hasPath(node.left, target) || hasPath(node.right, target); }
```

**Complexity:** O(n) time, O(h) space.
