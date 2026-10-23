# 339. Binary Tree Level Order Traversal

**Question:** Return the node values of a binary tree level by level.

**Answer:** BFS with a queue, processing one level's worth of nodes per iteration.

```java
List<List<Integer>> res = new ArrayList<>();
if (root == null) return res;
Queue<TreeNode> q = new LinkedList<>();
q.add(root);
while (!q.isEmpty()) {
    List<Integer> level = new ArrayList<>();
    for (int i = q.size(); i > 0; i--) {
        TreeNode n = q.poll();
        level.add(n.val);
        if (n.left != null) q.add(n.left);
        if (n.right != null) q.add(n.right);
    }
    res.add(level);
}
return res;
```

**Complexity:** O(n) time, O(w) space for max width w.
