# 055. Binary Tree Level Order Traversal

**Question:** Return tree values one level at a time from top to bottom.

**Answer:** A queue stores the current frontier; process exactly its size for each level.

```java
Queue<TreeNode> queue = new ArrayDeque<>(); queue.offer(root);
while (!queue.isEmpty()) {
    int levelSize = queue.size(); List<Integer> level = new ArrayList<>();
    while (levelSize-- > 0) { TreeNode node = queue.poll(); level.add(node.value);
        if (node.left != null) queue.offer(node.left); if (node.right != null) queue.offer(node.right); }
    answer.add(level);
}
```

**Complexity:** O(n) time, O(w) space where `w` is maximum width.
