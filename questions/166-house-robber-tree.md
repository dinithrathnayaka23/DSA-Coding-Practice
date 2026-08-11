# 166. House Robber III

**Question:** Maximize non-adjacent node values in a binary tree.

**Answer:** Return two values per node: best when taking it and best when skipping it.

```java
int[] rob(TreeNode node) { if (node == null) return new int[]{0, 0}; int[] left = rob(node.left), right = rob(node.right); int take = node.value + left[1] + right[1]; int skip = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); return new int[]{take, skip}; }
```

**Complexity:** O(n) time, O(h) space.
