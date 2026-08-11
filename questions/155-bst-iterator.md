# 155. BST Iterator

**Question:** Iterate through a BST in ascending order using O(h) memory.

**Answer:** Keep a stack of the path to the next smallest node and push the right subtree after consuming a node.

```java
void pushLeft(TreeNode node) { while (node != null) { stack.push(node); node = node.left; } }
int next() { TreeNode node = stack.pop(); pushLeft(node.right); return node.value; }
```

**Complexity:** O(1) amortized next, O(h) space.
