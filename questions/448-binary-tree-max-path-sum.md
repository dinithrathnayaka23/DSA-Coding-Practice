# 448. Binary Tree Maximum Path Sum

**Question:** Find the maximum sum of any path between two nodes in a binary tree.

**Answer:** Each node returns its best downward gain; the best path through it adds both child gains.

```java
int best = Integer.MIN_VALUE;
int gain(TreeNode n) {
    if (n == null) return 0;
    int l = Math.max(0, gain(n.left));
    int r = Math.max(0, gain(n.right));
    best = Math.max(best, n.val + l + r);
    return n.val + Math.max(l, r);
}
```

**Complexity:** O(n) time, O(h) space.
