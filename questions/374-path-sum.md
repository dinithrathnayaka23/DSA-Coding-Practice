# 374. Path Sum

**Question:** Decide whether a root-to-leaf path sums to a target.

**Answer:** Subtract the node value on the way down and check at a leaf.

```java
if (root == null) return false;
if (root.left == null && root.right == null) return root.val == target;
return hasPathSum(root.left, target - root.val) || hasPathSum(root.right, target - root.val);
```

**Complexity:** O(n) time, O(h) space.
