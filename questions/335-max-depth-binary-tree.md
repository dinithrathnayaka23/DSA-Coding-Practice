# 335. Maximum Depth of Binary Tree

**Question:** Return the number of nodes along the longest root-to-leaf path.

**Answer:** Depth is one plus the larger depth of the two subtrees.

```java
if (root == null) return 0;
return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
```

**Complexity:** O(n) time, O(h) recursion space.
