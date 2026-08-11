# 146. Partition Linked List

**Question:** Put nodes less than `x` before nodes greater than or equal to `x`, preserving order.

**Answer:** Build two chains and join them at the end.

```java
Node lower = new Node(0), higher = new Node(0), a = lower, b = higher;
while (head != null) { if (head.value < x) { a.next = head; a = a.next; } else { b.next = head; b = b.next; } head = head.next; }
b.next = null; a.next = higher.next; return lower.next;
```

**Complexity:** O(n) time, O(1) space.
