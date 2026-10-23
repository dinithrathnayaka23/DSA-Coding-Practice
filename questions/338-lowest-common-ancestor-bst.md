# 338. Lowest Common Ancestor of a BST

**Question:** Find the lowest common ancestor of two nodes in a binary search tree.

**Answer:** Walk down: if both values are smaller go left, if both larger go right, otherwise the current node splits them.

```java
while (root != null) {
    if (p.val < root.val && q.val < root.val) root = root.left;
    else if (p.val > root.val && q.val > root.val) root = root.right;
    else return root;
}
return null;
```

**Complexity:** O(h) time, O(1) space.
