# 367. Copy List with Random Pointer

**Question:** Deep copy a linked list where each node also has a random pointer.

**Answer:** Map each original node to its clone, then wire next and random from the map.

```java
Map<Node, Node> map = new HashMap<>();
for (Node n = head; n != null; n = n.next) map.put(n, new Node(n.val));
for (Node n = head; n != null; n = n.next) {
    map.get(n).next = map.get(n.next);
    map.get(n).random = map.get(n.random);
}
return map.get(head);
```

**Complexity:** O(n) time, O(n) space.
