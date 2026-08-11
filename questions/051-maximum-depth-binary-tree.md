# 051. Maximum Depth of Binary Tree

**Question:** Find the number of nodes on the longest root-to-leaf path.

**Answer:** The depth of a node is one plus the larger depth of its children.

```java
int depth(TreeNode node) {
    if (node == null) return 0;
    return 1 + Math.max(depth(node.left), depth(node.right));
}
```

**Complexity:** O(n) time, O(h) recursion space.
