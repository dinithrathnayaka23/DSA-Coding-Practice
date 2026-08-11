# 031. Reverse Linked List

**Question:** Reverse a singly linked list in place.

**Answer:** Redirect each node's `next` pointer toward the previous node.

```java
Node previous = null, current = head;
while (current != null) {
    Node next = current.next; current.next = previous;
    previous = current; current = next;
}
return previous;
```

**Complexity:** O(n) time, O(1) space.
