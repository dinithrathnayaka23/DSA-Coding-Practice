# 038. Copy List With Random Pointer

**Question:** Deep-copy a list whose nodes have `next` and arbitrary `random` pointers.

**Answer:** Map each original node to its clone, then make a second pass to connect pointers.

```java
Map<Node, Node> copies = new HashMap<>();
for (Node current = head; current != null; current = current.next) copies.put(current, new Node(current.value));
for (Node current = head; current != null; current = current.next) {
    copies.get(current).next = copies.get(current.next);
    copies.get(current).random = copies.get(current.random);
}
return copies.get(head);
```

**Complexity:** O(n) time, O(n) space.
