# 376. Construct Binary Tree from Preorder and Inorder

**Question:** Rebuild a binary tree from its preorder and inorder traversals.

**Answer:** Preorder gives each root; the inorder index splits left and right subtrees.

```java
int pre = 0;
Map<Integer, Integer> pos = new HashMap<>();
// fill pos: value -> index in inorder
TreeNode build(int[] preorder, int l, int r) {
    if (l > r) return null;
    TreeNode node = new TreeNode(preorder[pre++]);
    int m = pos.get(node.val);
    node.left = build(preorder, l, m - 1);
    node.right = build(preorder, m + 1, r);
    return node;
}
```

**Complexity:** O(n) time, O(n) space.
