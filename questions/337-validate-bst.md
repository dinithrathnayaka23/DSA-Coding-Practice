# 337. Validate Binary Search Tree

**Question:** Check whether a binary tree is a valid BST.

**Answer:** Pass down an exclusive lower and upper bound for every node.

```java
boolean valid(TreeNode n, long lo, long hi) {
    if (n == null) return true;
    if (n.val <= lo || n.val >= hi) return false;
    return valid(n.left, lo, n.val) && valid(n.right, n.val, hi);
}
// call: valid(root, Long.MIN_VALUE, Long.MAX_VALUE)
```

**Complexity:** O(n) time, O(h) space.
