# 059. Serialize and Deserialize a Binary Tree

**Question:** Convert a binary tree to a string and reconstruct it exactly.

**Answer:** Use preorder traversal with a null marker, then consume the tokens in the same order.

```java
void write(TreeNode node, List<String> out) {
    if (node == null) { out.add("#"); return; }
    out.add(String.valueOf(node.value)); write(node.left, out); write(node.right, out);
}
TreeNode read(Iterator<String> tokens) {
    String token = tokens.next(); if (token.equals("#")) return null;
    TreeNode node = new TreeNode(Integer.parseInt(token));
    node.left = read(tokens); node.right = read(tokens); return node;
}
```

**Complexity:** O(n) time and O(n) serialized space.
