# 451. Flatten Binary Tree to Linked List

**Question:** Flatten a binary tree in place into a right-only list in preorder.

**Answer:** For each node with a left child, attach the right subtree to the left subtree's rightmost node and move left to right.

```java
TreeNode cur = root;
while (cur != null) {
    if (cur.left != null) {
        TreeNode p = cur.left;
        while (p.right != null) p = p.right;
        p.right = cur.right;
        cur.right = cur.left;
        cur.left = null;
    }
    cur = cur.right;
}
```

**Complexity:** O(n) time, O(1) space.
