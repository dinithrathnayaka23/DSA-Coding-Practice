# 377. Binary Tree Right Side View

**Question:** Return the nodes visible when looking at a binary tree from the right.

**Answer:** BFS by level and record the last node of each level.

```java
List<Integer> res = new ArrayList<>();
if (root == null) return res;
Queue<TreeNode> q = new LinkedList<>();
q.add(root);
while (!q.isEmpty()) {
    for (int i = q.size(); i > 0; i--) {
        TreeNode n = q.poll();
        if (i == 1) res.add(n.val);
        if (n.left != null) q.add(n.left);
        if (n.right != null) q.add(n.right);
    }
}
return res;
```

**Complexity:** O(n) time, O(w) space.
