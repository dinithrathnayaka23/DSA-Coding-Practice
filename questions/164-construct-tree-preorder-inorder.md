# 164. Construct Tree From Preorder and Inorder

**Question:** Rebuild a binary tree from preorder and inorder traversals.

**Answer:** Preorder gives the root; a map finds its inorder split and recursion builds both subtrees.

```java
TreeNode build(int preLeft, int inLeft, int inRight) { if (inLeft > inRight) return null; TreeNode root = new TreeNode(preorder[preLeft]); int split = positions.get(root.value); int leftSize = split - inLeft; root.left = build(preLeft + 1, inLeft, split - 1); root.right = build(preLeft + leftSize + 1, split + 1, inRight); return root; }
```

**Complexity:** O(n) time, O(n) map and recursion space.
