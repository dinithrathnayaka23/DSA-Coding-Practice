# 278. File System Trie

**Question:** Implement `mkdir`, `addContentToFile`, and `readContentFromFile` for a virtual file system.

**Answer:** Store directory children in a trie node and keep file content at terminal nodes.

```java
Node walk(String path, boolean create) { Node node = root; for (String part : path.split("/")) if (!part.isEmpty()) node = create ? node.children.computeIfAbsent(part, x -> new Node()) : node.children.get(part); return node; }
```

**Complexity:** O(path length) per operation, O(total path characters) space.
