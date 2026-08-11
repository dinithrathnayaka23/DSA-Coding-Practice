# 057. Kth Smallest Value in a BST

**Question:** Find the kth smallest value in a binary search tree.

**Answer:** In-order traversal visits BST values in ascending order; stop at the kth visit.

```java
Deque<TreeNode> stack = new ArrayDeque<>();
while (true) {
    while (root != null) { stack.push(root); root = root.left; }
    root = stack.pop(); if (--k == 0) return root.value; root = root.right;
}
```

**Complexity:** O(h + k) time, O(h) space.
