# 058. Lowest Common Ancestor in a BST

**Question:** Find the lowest node that is an ancestor of two given BST nodes.

**Answer:** If both targets are smaller, go left; if both are larger, go right; otherwise the current node splits them.

```java
while (root != null) {
    if (p.value < root.value && q.value < root.value) root = root.left;
    else if (p.value > root.value && q.value > root.value) root = root.right;
    else return root;
}
return null;
```

**Complexity:** O(h) time, O(1) space.
