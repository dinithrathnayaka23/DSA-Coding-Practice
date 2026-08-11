# 161. Path Sum II

**Question:** Return every root-to-leaf path whose sum equals a target.

**Answer:** Backtrack a current path and copy it when a matching leaf is reached.

```java
void collect(TreeNode node, int remaining, List<Integer> path) { if (node == null) return; path.add(node.value); if (node.left == null && node.right == null && remaining == node.value) answer.add(new ArrayList<>(path)); collect(node.left, remaining - node.value, path); collect(node.right, remaining - node.value, path); path.remove(path.size() - 1); }
```

**Complexity:** O(n · h) including copied results, O(h) recursion space.
