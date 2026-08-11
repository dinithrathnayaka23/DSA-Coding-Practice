# 145. Reverse Nodes in K-Group

**Question:** Reverse every complete group of `k` linked-list nodes.

**Answer:** Verify a full group exists, reverse it, and recursively or iteratively connect the groups.

```java
Node groupEnd = head; for (int i = 0; i < k && groupEnd != null; i++) groupEnd = groupEnd.next; if (groupEnd == null) return head;
Node next = groupEnd, previous = null, current = head; while (current != next) { Node after = current.next; current.next = previous; previous = current; current = after; }
head.next = reverseKGroup(next, k); return previous;
```

**Complexity:** O(n) time, O(n/k) recursion space.
