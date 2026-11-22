# 447. Minimum Depth of Binary Tree

**Question:** Return the number of nodes on the shortest path from the root to a leaf.

**Answer:** If one child is missing, the depth must follow the other child; otherwise take the smaller depth.

```java
if (root == null) return 0;
if (root.left == null) return 1 + minDepth(root.right);
if (root.right == null) return 1 + minDepth(root.left);
return 1 + Math.min(minDepth(root.left), minDepth(root.right));
```

**Complexity:** O(n) time, O(h) space.
