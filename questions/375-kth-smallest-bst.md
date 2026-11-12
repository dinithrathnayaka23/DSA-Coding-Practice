# 375. Kth Smallest Element in a BST

**Question:** Return the kth smallest value in a binary search tree.

**Answer:** Iterative in-order traversal; stop at the kth node.

```java
Deque<TreeNode> st = new ArrayDeque<>();
TreeNode cur = root;
while (cur != null || !st.isEmpty()) {
    while (cur != null) { st.push(cur); cur = cur.left; }
    cur = st.pop();
    if (--k == 0) return cur.val;
    cur = cur.right;
}
return -1;
```

**Complexity:** O(h + k) time, O(h) space.
