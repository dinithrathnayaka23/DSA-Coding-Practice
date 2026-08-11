# 056. Validate Binary Search Tree

**Question:** Determine whether every node obeys the strict BST ordering rule.

**Answer:** Carry an exclusive lower and upper bound down the recursion.

```java
boolean valid(TreeNode node, long low, long high) {
    if (node == null) return true;
    if (node.value <= low || node.value >= high) return false;
    return valid(node.left, low, node.value) && valid(node.right, node.value, high);
}
return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
```

**Complexity:** O(n) time, O(h) space.
