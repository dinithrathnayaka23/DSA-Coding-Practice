# 162. Sum Root-to-Leaf Numbers

**Question:** Sum numbers formed by root-to-leaf digit paths.

**Answer:** Carry the current number as `parent * 10 + node.value`.

```java
int sum(TreeNode node, int value) { if (node == null) return 0; value = value * 10 + node.value; if (node.left == null && node.right == null) return value; return sum(node.left, value) + sum(node.right, value); }
```

**Complexity:** O(n) time, O(h) space.
