# 154. Recover a Swapped BST

**Question:** Restore a BST where exactly two node values were accidentally swapped.

**Answer:** In-order traversal should be sorted; record the first and last inversions, then swap their values.

```java
void visit(TreeNode node) { if (node == null) return; visit(node.left); if (previous != null && previous.value > node.value) { if (first == null) first = previous; second = node; } previous = node; visit(node.right); }
```

**Complexity:** O(n) time, O(h) recursion space.
