# 148. Flatten a Multilevel Doubly Linked List

**Question:** Flatten child-linked doubly-list levels into one depth-first list.

**Answer:** Splice each child list between the node and its next pointer, recursively or with a stack.

```java
if (node.child != null) { Node child = flatten(node.child), after = node.next; node.next = child; child.prev = node; node.child = null; while (node.next != null) node = node.next; node.next = after; if (after != null) after.prev = node; }
```

**Complexity:** O(n) time, O(1) auxiliary space for recursive-free traversal.
