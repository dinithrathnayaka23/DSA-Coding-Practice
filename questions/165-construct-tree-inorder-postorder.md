# 165. Construct Tree From Inorder and Postorder

**Question:** Rebuild a binary tree from inorder and postorder traversals.

**Answer:** Postorder's final value is the root; split inorder and build the right subtree first.

```java
TreeNode build(int inLeft, int inRight) { if (inLeft > inRight) return null; int value = postorder[index--]; TreeNode root = new TreeNode(value); int split = positions.get(value); root.right = build(split + 1, inRight); root.left = build(inLeft, split - 1); return root; }
```

**Complexity:** O(n) time, O(n) space.
