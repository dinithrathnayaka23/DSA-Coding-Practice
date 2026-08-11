# 143. Rotate Linked List

**Question:** Rotate a linked list to the right by `k` positions.

**Answer:** Make the list circular, then break it before the new head.

```java
int length = 1; Node tail = head; while (tail.next != null) { tail = tail.next; length++; } k %= length; if (k == 0) return head;
tail.next = head; for (int steps = length - k; steps-- > 0;) tail = tail.next; head = tail.next; tail.next = null; return head;
```

**Complexity:** O(n) time, O(1) space.
