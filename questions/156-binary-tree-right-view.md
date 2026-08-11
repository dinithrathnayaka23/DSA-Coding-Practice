# 156. Binary Tree Right Side View

**Question:** Return the values visible when looking at a binary tree from the right.

**Answer:** BFS levels expose the last node processed at each depth.

```java
Queue<TreeNode> queue = new ArrayDeque<>(); queue.offer(root);
while (!queue.isEmpty()) { int size = queue.size(); for (int i = 0; i < size; i++) { TreeNode node = queue.poll(); if (i == size - 1) answer.add(node.value); if (node.left != null) queue.offer(node.left); if (node.right != null) queue.offer(node.right); } }
```

**Complexity:** O(n) time, O(w) space.
